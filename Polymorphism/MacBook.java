package Polymorphism;

public class MacBook implements AppleLaptop{
    
    public void start(){
        System.out.println("Inside MacBook start()");
    }

    public void shutdown(){
        System.out.println("Inside MacBook shutdown()");
    }
}
