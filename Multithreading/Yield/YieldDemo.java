package Multithreading.Yield;

public class YieldDemo {
    
    public static void main(String[] args) {
        
        MyThread mt = new MyThread();
        mt.start();

        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
