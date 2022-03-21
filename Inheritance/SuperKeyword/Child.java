package Inheritance.SuperKeyword;

public class Child extends Parent{
    
    @Override
    void f1(){
        super.f1();
        System.out.println("Inside Child F1");
    }
}
