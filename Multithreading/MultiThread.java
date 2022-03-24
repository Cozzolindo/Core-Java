package Multithreading;

public class MultiThread extends Thread{
    
    public void run(){
        for(int i = 0; i<= 100; i++){
            System.out.print(i+"\t");
            System.out.println("Thread Name: "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        
        MultiThread mt = new MultiThread();
        mt.setPriority(MAX_PRIORITY);
        mt.setName("MT");
        mt.start();
        mt.join();

        for(int i = 100; i>-1; i--){
            System.out.print(i+"\t");
            System.out.println("Thread Name: "+Thread.currentThread().getName());

        }

        MultiThread mt1 = new MultiThread();
        mt1.setPriority(NORM_PRIORITY);
        mt1.setName("MT1");
        mt1.start();

        MultiThread mt2 = new MultiThread();
        mt2.setPriority(MIN_PRIORITY);
        mt2.setName("MT2");
        mt2.start();
    }
}
