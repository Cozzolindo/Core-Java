package Polymorphism;

public class MultiBinding {
    
    void add(int a, int b){
        System.out.println("Result is ->"+(a+b));
    }

    void add(double a, double b){
        System.out.println("Result is ->"+(a-b));
    }

    void add(double a, double b, double c){
        double result = a*a+b*b-c*c;
        System.out.println("Result is ->"+result);
    }

    public static void main(String[] args) {
        MultiBinding MB = new MultiBinding();
        MB.add(10, 20);
        MB.add(10.20, 30.40);
        MB.add(1, 2, 3);
    }
}
