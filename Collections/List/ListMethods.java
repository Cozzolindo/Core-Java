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

        System.out.println("After insert: " + list);

        List<Integer> slist = new ArrayList<>();
        for(int i = 2; i <= 100; i*=2){
            slist.add(i);
        }

        System.out.println("Second List: "+slist);

        list.addAll(0,slist);

        System.out.println("After addALL: "+list);

        if(list.contains(64)){
            System.out.println("List contains 64");
        }else{
            System.out.println("List does not contains 64");
        }
    }
}
