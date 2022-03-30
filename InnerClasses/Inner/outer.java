package InnerClasses.Inner;


public class outer {
    
    static void f1(){
        System.out.println("Outers Static Method");
    }
    static class Inner{
        static void f2(){
            System.out.println("Inners Static Method");
        }

        void f3(){
            System.out.println("Non static method");
        }
    }

    
    public static void main(String[] args) {
        
        outer.f1();
        outer.Inner.f2();

        outer.Inner inner = new outer.Inner();

        inner.f3();

    }
}
