package IOReading.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationD {
    
    public static void main(String[] args) {
        
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            fos = new FileOutputStream("Texts/Copy/Emp.ser");
            oos = new ObjectOutputStream(fos);

            Employee emp = new Employee(115086800, "Carlos Cozzolino", 1500, 654321);
            oos.writeObject(emp);
            System.out.println("Emp serialized!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
