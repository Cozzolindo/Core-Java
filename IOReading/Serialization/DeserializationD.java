package IOReading.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationD {
    
    public static void main(String[] args) throws IOException {
        
        FileInputStream fis = new FileInputStream("Texts/Copy/Emp.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            Object obj = ois.readObject();
            Employee emp = (Employee)obj;

            System.out.println("Employee id: "+ emp.id);
            System.out.println("Employee name: "+ emp.name);
            System.out.println("Employee salary: "+ emp.salary);
            System.out.println("Employee SSN: "+ emp.ssn);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
