package IOReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {
    
    public static void main(String[] args) {
        
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("Texts/first.txt"));
            System.out.println("File opened!");
            
            int i;
            try {
                while((i = fis.read())!=-1){
                    System.out.println((char)i);
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
