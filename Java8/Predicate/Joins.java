package Java8.Predicate;

import java.util.function.Predicate;

public class Joins {
    
    public static void main(String[] args) {
        
        int[] list = {0,10,20,30,40,50,60,70,80,90,100};

        Predicate<Integer> l1 = i->i>50;
        System.out.println("Greater than 50: ");
        method1(l1, list);
    }

    static void method1(Predicate<Integer> p, int[] list){
        for(int eachValue:list){
            if(p.test(eachValue)){
                System.out.println(eachValue);
            }
        }
    }
}
