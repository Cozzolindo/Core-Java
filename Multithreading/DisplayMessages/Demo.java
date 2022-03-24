package Multithreading.DisplayMessages;

public class Demo {
    
    public static void main(String[] args) {
        
        Synch dm = new Synch();
        MyThread mt = new MyThread(dm, "Carl");
        MyThread tm = new MyThread(dm, "Johnson");

        tm.start();
        tm.interrupt();
        mt.start();
    }
}
