package Multithreading.DisplayMessages;

public class MyThread extends Thread{
    
    Synch dm;
    String name;


    public MyThread(Synch dm, String name) {
        this.dm = dm;
        this.name = name;
    }

    public void run(){
        dm.sayHello(name);
    }
}
