package Polymorphism;

public class RuntimeBinding {
    
    public static void main(String[] args) {
        
        AppleLaptop mbp = new MacBookPro();
        
        

        mbp.start();
        mbp.shutdown();

        System.out.println("----------------------------------------------------------------------");

        AppleLaptop mb = new MacBookAir();
        mb.start();
        mb.shutdown();
        
    }
}
