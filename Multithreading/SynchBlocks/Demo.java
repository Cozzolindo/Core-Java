package Multithreading.SynchBlocks;

public class Demo {
    
    public static void main(String[] args) {
        Synch dm = new Synch();
        MyThread mt = new MyThread("Carl", dm);
        MyThread tm = new MyThread("Johnson", dm);

        tm.start();
        tm.interrupt();
        mt.start();
    }
}
