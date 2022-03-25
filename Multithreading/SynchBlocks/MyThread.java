package Multithreading.SynchBlocks;

public class MyThread extends Thread{
    
    String name;
    Synch dm;

    public MyThread(String name, Synch dm) {
        this.name = name;
        this.dm = dm;
    }

    public void run(){
        dm.sayHello(name);
    }
}
