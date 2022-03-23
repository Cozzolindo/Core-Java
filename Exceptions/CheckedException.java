package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    
    void readFile() throws FileNotFoundException{
        FileInputStream FIS = new FileInputStream("");
    }
    public static void main(String[] args) {
        
        
        CheckedException CE = new CheckedException();
        try{
            CE.readFile();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found!");
        }
        
    }
}
