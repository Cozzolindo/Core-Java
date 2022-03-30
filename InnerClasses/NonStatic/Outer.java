package InnerClasses.NonStatic;

public class Outer {
    
    private static int x = 50;
    private int y;

    Outer(int y){
        this.y = y;
    }
    class Inner{

        private int y;
        Inner(int y){
            this.y = y;
        }
        void f1(){
            System.out.println("Outer.x " + Outer.x);
            System.out.println("Outer.this.y "+Outer.this.y);
            System.out.println("this.y "+this.y);
        }
    }

    void f2(){
        System.out.println("Non static Outter Method");
    }

    public static void main(String[] args) {
        
        Outer fora = new Outer(50);
        fora.f2();

        Outer.Inner inner = fora.new Inner(30);
        inner.f1();
        System.out.println(inner.y);
    }
}
