package IOReading;

import java.util.Scanner;

public class ScannerD {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your ID, complete name and score: ");
        int id;
        String name;
        double score;
        id = scan.nextInt();
        name = scan.next();
        scan.nextLine();
        score = scan.nextDouble();

        System.out.println(id);
        System.out.println(name);
        System.out.println(score);
    }
}
