package IOReading;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        System.out.println("Type some numbers so we can sum this for you, type a word to end the loop!");
        while(scan.hasNextInt()){
            int num = scan.nextInt();
            sum += num;
        }

        System.out.println(sum + " is the sum.");
    }
}
