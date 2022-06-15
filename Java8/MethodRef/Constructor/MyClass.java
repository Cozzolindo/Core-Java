package Java8.MethodRef.Constructor;

public class MyClass {
    
    private String s;

    MyClass(String s){
        this.s = s;
        System.out.println("Inside Constructor" + s);
    }
}
