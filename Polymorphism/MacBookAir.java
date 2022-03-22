package Polymorphism;

public class MacBookAir extends MacBookPro{
    
    @Override
    public void start() {
        System.out.println("Inside MacBookAir start()");
    }

    @Override
    public void shutdown() {
        System.out.println("Inside MacBookAir shutdown()");
    }
}
