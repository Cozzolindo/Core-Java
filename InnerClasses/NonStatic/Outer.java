package InnerClasses.NonStatic;

public class Outer {
    

    class Inner{
        void f1(){
            System.out.println("Non static Inner Method");
        }
    }

    void f2(){
        System.out.println("Non static Outter Method");
    }

    public static void main(String[] args) {
        
        Outer fora = new Outer();
        fora.f2();

        Outer.Inner inner = fora.new Inner();
        inner.f1();
    }
}
