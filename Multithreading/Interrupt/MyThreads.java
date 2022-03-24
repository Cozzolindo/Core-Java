package Multithreading.Interrupt;

public class MyThreads extends Thread{
    
    @Override
    public void run() {
        for(int i =0; i<10; i++){
            System.out.println("I'm a lazy thread.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Got interrupted");
                
            }
        }
    }
}
