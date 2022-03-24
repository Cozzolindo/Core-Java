package Multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread{
    
    static int n, sum = 1;
    public static void main(String[] args) {
        
        System.out.println("Factorial of N numbers");
        System.out.println("Enter a value: ");
        Scanner scan = new Scanner(System.in);
        JoinDemo.n = scan.nextInt();
        Thread ct = Thread.currentThread();

        long start = System.currentTimeMillis();
        JoinDemo jd = new JoinDemo();
        jd.start();
        try {
            jd.join();
            System.out.println("Current thread is: "+ct.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Factorial of " + JoinDemo.n + " is " + JoinDemo.sum);
        long end = System.currentTimeMillis();

        System.out.println((end-start) + "milisseconds elapsed.");
    }

    public void run(){
        Thread ct = Thread.currentThread();
        for(int i = 1; i<=JoinDemo.n; i++){
            System.out.println("Current thread is: "+ct.getName());
            JoinDemo.sum *= i;
        }
    }
}
