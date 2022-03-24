package Multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread{
    
    static int n, sum = 1;
    public static void main(String[] args) {
        
        System.out.println("Factorial of N numbers");
        System.out.println("Enter a value: ");
        Scanner scan = new Scanner(System.in);
        JoinDemo.n = scan.nextInt();
        
        JoinDemo jd = new JoinDemo();
        jd.start();
        try {
            jd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Factorial of " + JoinDemo.n + " is " + JoinDemo.sum);
    }

    public void run(){
        for(int i = 1; i<=JoinDemo.n; i++){
            JoinDemo.sum *= i;
        }
    }
}
