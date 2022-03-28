package Deadlocks;

public class FirstResource {
    
    public synchronized void method1(SecondResource SR){
        System.out.println("Method one on Resource two");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Invoking Method two:");
        SR.method2();
    }

    public synchronized void method2(){
        System.out.println("Method two on Resource two");
    }
}
