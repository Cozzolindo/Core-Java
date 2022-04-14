package OCMethods.Passenger;

public class Passenger {
    
    private String firstName;
    private String lastName;
    private int ID;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    @Override
    public int hashCode() {
        return ID;
    }

    @Override
    public boolean equals(Object obj) {
        Passenger passenger = (Passenger) obj;
        if(passenger.ID == this.ID && passenger.firstName == this.firstName && passenger.lastName == this.lastName){
            return true;
        }else{
            return false;
        }
    }
}
