package InnerClasses.LocalInner;

public class Outer {
    
    void f1(){

        System.out.println("Inside Local Inner F1");
        class LocalInner{
            void f2(){
                System.out.println("Inside Local Inner F2");
            }
        }
        LocalInner inner = new LocalInner();
        inner.f2();
    }

    public static void main(String[] args) {
        
        Outer outer = new Outer();
        outer.f1();
    }
}