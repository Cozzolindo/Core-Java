package Collections.List;
import java.util.Random;

public class RandomDemo {
    
    public static void main(String[] args) {
        
        Random obj = new Random();

        int x = obj.nextInt();
        System.out.println("X: "+x);

        int y = obj.nextInt(10);
        System.out.println("Y: "+y);

    }
}