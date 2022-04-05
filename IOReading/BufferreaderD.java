package IOReading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferreaderD {
    
    public static void main(String[] args) {
        
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("Texts/second.txt");
            br = new BufferedReader(fr);

            String line;
            int count = 0;
            while((line = br.readLine())!=null){

                StringTokenizer st = new StringTokenizer(line);
                while(st.hasMoreTokens()){
                    System.out.println(st.nextToken());
                    count++;
                }
            }
            System.out.println(count + " is the number of word in this doc.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        
    }
}
