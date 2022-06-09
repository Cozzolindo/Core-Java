package Java8;

public class Teste {
    
    public static void main(String[] args) {
        A a = ()->System.out.println("Inside myMethod1()");
        a.myMethod1();
    }
}
