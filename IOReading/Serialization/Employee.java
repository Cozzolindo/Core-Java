package IOReading.Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    
    int id;
    String name;
    double salary;
    transient int ssn;


    public Employee(int id, String name, double salary, int snn) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.ssn = snn;
    }

}
