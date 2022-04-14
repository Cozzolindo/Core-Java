package OCMethods.Passenger;

public class Test {
    
    public static void main(String[] args) {
        Passenger passenger = new Passenger();

        passenger.setFirstName("Caroline");
        passenger.setLastName("Xavier");
        passenger.setID(20021996);

        Passenger passenger2 = new Passenger();

        passenger2.setFirstName("Caroline");
        passenger2.setLastName("Xavier");
        passenger2.setID(20021996);

        Passenger passenger3 = new Passenger();

        passenger3.setFirstName("Carol");
        passenger3.setLastName("Xavier");
        passenger3.setID(20021996);

        System.out.println(passenger.equals(passenger2));
        System.out.println(passenger.equals(passenger3));
        System.out.println(passenger.toString());
        System.out.println(passenger.hashCode());
    }
}
