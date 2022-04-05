package IOReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {
    
    public static void main(String[] args) {
        
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("Texts/Me.jpeg");
            fos = new FileOutputStream("Texts/Copy/Myself.jpg");
            int data;
            while((data=fis.read())!=-1){
                fos.write(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Copied");
    }
}
