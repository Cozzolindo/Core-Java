package Inheritance.SuperKeyword;

public class Child extends Parent{
    
    public double c,d;


    public Child(double c, double d, int a, int b) {
        super(a, b);
        this.c = c;
        this.d = d;
    }

    @Override
    void f1(){
        super.f1();

        System.out.println("Inside Child F1");
    }

    void display(){
        System.out.println("Parents: " + super.a + " and " + super.b);
        System.out.println("Childs: " + c + " and " + d);
    }
}
