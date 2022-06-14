package Java8.Predicate;

import java.util.function.Predicate;

public class GreaterThan {
    
    public static void main(String[] args) {
        
        Predicate<Integer> greater = i->(i>20);
        System.out.println(greater.test(16));
        System.out.println(greater.test(10));
        System.out.println(greater.test(26));
        System.out.println(greater.test(36));
        System.out.println(greater.test(6));
        System.out.println(greater.test(-16));
        System.out.println(greater.test(116));

    }
}
