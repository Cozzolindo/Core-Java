package Java8.Anonymous;

public class Teste {
    
    public static void main(String[] args) {
        
        Thread t = new Thread(()->{
            for(int i = 0; i<10; i++){
                System.out.println("Child");
            }
        });

        t.start();

        for(int i = 0; i<10; i++){
            System.out.println("Main");
        }
    }
}
