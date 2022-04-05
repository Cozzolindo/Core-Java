package IOReading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterAndReader {
    
    public static void main(String[] args) {
        
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("Texts/first.txt");
            fw = new FileWriter("Texts/Copy/copy.txt");

            int ch;

            while((ch = fr.read())!= -1){
                fw.write(ch);
            }
        } catch (IOException e) {
            
            e.printStackTrace();
        } finally{
            try {
                fr.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }

        System.out.println("Copied!");
    }
}
