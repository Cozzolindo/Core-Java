package Multithreading.DisplayMessages;

public class Demo {
    
    public static void main(String[] args) {
        
        MyThread mt = new MyThread("Carl");
        MyThread tm = new MyThread("Johnson");

        tm.start();
        tm.interrupt();
        mt.start();
    }
}
