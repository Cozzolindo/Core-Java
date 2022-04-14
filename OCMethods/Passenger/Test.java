package OCMethods.Passenger;

public class Test {
    
    public static void main(String[] args) {
        Passenger passenger = new Passenger();

        passenger.setFirstName("Caroline");
        passenger.setLastName("Xavier");
        passenger.setID(20021996);
        System.out.println(passenger.toString());
        System.out.println(passenger.hashCode());
    }
}
