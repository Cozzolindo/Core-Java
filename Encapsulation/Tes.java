package Encapsulation;

public class Tes {
    
    public static void main(String[] args) {
        
        Customer c = new Customer();
        c.setLastName("Cozzolindo");
        c.setFirstName("Carlos");
        c.setCreditCard((long) 115086800);

        System.out.println("First name: " + c.getFirstName());
        System.out.println("Last name: " + c.getLastName());
        System.out.println("Card Numbers: " + c.getCreditCard());
    }
}
