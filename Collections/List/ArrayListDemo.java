package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);//Autoboxing
        list.add(30);
        //list.add("Carlos");

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }

        System.out.println(list);
    }
}
