package Collections.List;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class OtherSets {
    
    public static void main(String[] args) {
        
        Random obj = new Random();

        //HashSet<Integer> sett = new HashSet<>(); // Does not maintain it`s order

        //LinkedHashSet<Integer> sett = new LinkedHashSet<>(); // Maintain it's order

        Set<Integer> sett = new TreeSet<>(); // Generate an ordered list
        for(int i = 0; i<10; i++){
            int num = obj.nextInt(100);
            sett.add(num);
            System.out.print(num);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println("Set: "+sett);

    }
}
