package Java8.Functions;

import java.util.function.Function;

public class FunctionTeste {
    
    public static void main(String[] args) {
        
        Function<String, Integer> func = s->s.length();
        System.out.println(func.apply("Carlos"));
        System.out.println(func.apply("Cozzolino")); 
    }
}
