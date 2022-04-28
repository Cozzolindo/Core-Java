package Collections.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        list = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.print("Crescent list: ");
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }

        for(int i = 0; i<list.size(); i++){
            int aux = list.get(i);
            if(aux == list.get(i+1)){
                list.remove(i);
            }
        }

        System.out.println();
        System.out.print("Crescent list: ");
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}
