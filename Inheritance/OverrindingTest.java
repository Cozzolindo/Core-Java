package Inheritance;

public class OverrindingTest {
    
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        System.out.println(car.Fuel()); 
        System.out.println(bike.Fuel());
    }
}
