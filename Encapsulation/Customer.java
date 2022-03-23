package Encapsulation;

public class Customer {
    
    private String firstName;
    private String lastName;
    private Long creditCard;


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getCreditCard() {
        return this.creditCard;
    }

    public void setCreditCard(Long creditCard) {
        this.creditCard = creditCard;
    }


}
