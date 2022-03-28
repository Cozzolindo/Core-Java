package Deadlocks;

public class SecondResource {
    
    
        public synchronized void method1(FirstResource FR){
            System.out.println("Method one");
    
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("Invoking Method One:");
            FR.method2();
        }
    
        public synchronized void method2(){
            System.out.println("Method two");
        }
    
}
