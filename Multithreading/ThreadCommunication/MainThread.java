package Multithreading.ThreadCommunication;

import java.util.Scanner;

public class MainThread {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Please, inform N: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        MyThread mt = new MyThread(n);
        mt.start();

        synchronized(mt){
            mt.wait();
            System.out.println("Factorial of " + mt.n + " is: ");
            System.out.println(mt.total);
        }
    }
}
