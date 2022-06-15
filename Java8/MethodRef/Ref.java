package Java8.MethodRef;

public class Ref {
    

    public static void m1(){
        for(int i = 0; i<=10; i++){
            System.out.println("Natural "+i);
        }
    }
    public static void main(String[] args) {
        
        Runnable r = Ref::m1;

        Thread t = new Thread(r);
        t.start();

        for(int i = 10; i>=0; i--){
            System.out.println("Reverse "+i);
        }
    }
}
