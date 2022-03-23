package Multithreading;

public class MultiThread extends Thread{
    
    public void run(){
        for(int i = 0; i<= 100; i++){
            System.out.print(i+"\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Child Thread Exiting");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        
        MultiThread mt = new MultiThread();
        mt.start();
        
        for(int i = 100; i>-1; i--){
            System.out.print(i+"\t");
            Thread.sleep(2000);

        }
    }
}
