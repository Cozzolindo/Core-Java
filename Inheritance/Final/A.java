package Inheritance.Final;

public final class A {
    
    final static float pi = 3.14f;

    public final void displayValues(){
        System.out.println(A.pi);
    }

    public static void main(String[] args) {
        System.out.println(A.pi);
        //a.pi = 3.25f;
    }
}
