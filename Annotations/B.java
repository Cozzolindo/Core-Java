package Annotations;

public class B {
    
    public static void main(String[] args) {
        A a = new A();
        aParent o = new aParent();
        a.myMethod();

        System.out.println(a.anotherOne());
        System.out.println(a);

        System.out.println(o);
        System.out.println(o.anotherOne());
        o.myMethod();
    }
}
