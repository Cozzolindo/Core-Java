package Abstraction.PopularCars;

public abstract class Fiat {
    

    void commonFunc(){
        System.out.println("Inside common functionalities!");
    }

    abstract void accelerate();

    abstract void brake();

    public static void main(String[] args) {
        System.out.println("Inside Main Method!");
    }

}
