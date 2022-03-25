package Multithreading.SynchBlocks;

public class Synch {
    
    public void sayHello(String name){
        
        synchronized(Synch.class){
            for(int i = 1; i<=10; i++){
                System.out.println(name+"\t"+i);
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    System.out.println("Sorry bro...");
                }
            }
        }
    }
}
