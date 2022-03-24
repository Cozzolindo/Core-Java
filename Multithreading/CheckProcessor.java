package Multithreading;

public class CheckProcessor implements Runnable{

    @Override
    public void run() {
        System.out.println("My name is: "+Thread.currentThread().getName());        
    }
    
    public static void main(String[] args) {
        
        CheckProcessor cp = new CheckProcessor();
        
        Thread T = new Thread(cp);
        T.start();
    }
}
