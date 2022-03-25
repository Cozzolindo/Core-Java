package Multithreading.DisplayMessages;

public class Synch {
    
    public synchronized static void sayHello(String name){
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
