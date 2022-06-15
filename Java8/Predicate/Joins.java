package Java8.Predicate;

import java.util.function.Predicate;

public class Joins {
    
    public static void main(String[] args) {
        
        int[] list = {0,11,22,33,44,55,66,77,88,99,110};

        Predicate<Integer> l1 = i->i>50;
        Predicate<Integer> l2 = i->i%2==0;
        System.out.println("Greater than 50: ");
        method1(l1, list);
        System.out.println("Even numbers: ");
        method1(l2, list);
        System.out.println("Greater than 50: ");
        method1(l1.negate(), list);
        System.out.println("Odd Numbers: ");
        method1(l2.negate(), list);
        System.out.println("Greater than 50 and Odd: ");
        method1(l1.and(l2.negate()), list);
        System.out.println("Greater than 50 and Even: ");
        method1(l1.and(l2), list);
        System.out.println("Greater than 50 or Even: ");
        method1(l1.or(l2), list);
    }

    static void method1(Predicate<Integer> p, int[] list){
        for(int eachValue:list){
            if(p.test(eachValue)){
                System.out.println(eachValue);
            }
        }
    }

}
