package Deadlocks;

public class DeadlocksDemo implements Runnable{
    
    FirstResource fr = new FirstResource();
    SecondResource sr = new SecondResource();


    public DeadlocksDemo() {
        new Thread(this).start();
        sr.method1(fr);
    }

    public static void main(String[] args) {
        new DeadlocksDemo();
    }

    @Override
    public void run() {
        fr.method1(sr);
    } 
}
