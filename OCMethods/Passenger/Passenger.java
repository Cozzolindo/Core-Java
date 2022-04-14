package OCMethods.Passenger;

public class Passenger {
    
    private String firstName;
    private String lastName;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Method toString returns: "+ this.firstName + " " + this.lastName;
    }
}
