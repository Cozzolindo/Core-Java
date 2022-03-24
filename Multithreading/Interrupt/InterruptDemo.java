package Multithreading.Interrupt;

public class InterruptDemo {
    
    public static void main(String[] args) {
        
        MyThreads mt = new MyThreads();
        mt.start();
         
        mt.interrupt();

        System.out.println("End of the Evangelion");
    }
}
