package JavaBasics;

public class staticMethod {
    public static void main(String[] args) {
        System.out.println("Inside Main!");
        staticMethod.method1();
    }

    static void method1(){
        System.out.println("Inside method one!");
    }

    static{
        System.out.println("Inside Static Block !");
        staticMethod.method1();
    }
}
