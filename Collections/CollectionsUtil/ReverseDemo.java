package Collections.CollectionsUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ReverseDemo {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();

        int x = 10;
        while(x>0){
            list.add(x*x);
            x--;
        }

        System.out.println("List before reverse: ");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("List after reverse: ");
        System.out.println(list);
    }
}
