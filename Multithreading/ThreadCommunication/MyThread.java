package Multithreading.ThreadCommunication;

public class MyThread extends Thread{
    
    long total = 1;
    int n;

    public MyThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        
        System.out.println("Thread "+Thread.currentThread().getName()+" is calculating...");

        synchronized(this){
            for(int i = 1; i<=n; i++){
                total*=i;
            }
            this.notify();
        }
    }
}
