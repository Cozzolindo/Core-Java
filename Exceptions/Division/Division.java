package Exceptions.Division;

import java.util.Scanner;

public class Division {
    
    private static int a,b,c;
    
    public static void main(String[] args) {
        System.out.println("Enter two integers: ");
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();
        try{
            c = a/b;
            System.out.println("Division: a/b " + c);
        }catch(ArithmeticException AE){
            System.out.println("Can't divide a/b.");
        }
        
        
        
        try{
            c = b/a;
            System.out.println("Division: b/a " + c);
        }catch(ArithmeticException AE){
            System.out.println("Can not divide b/a.");
        }
        
    }
}
