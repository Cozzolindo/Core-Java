package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        for(int i = 100; i >= 0; i-=10){
            list.add(i);
        }

        System.out.println("List: " + list);

        list.add(2,100);

        System.out.println("After instert: " + list);
    }
}
