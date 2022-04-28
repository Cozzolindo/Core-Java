package Collections.List;

import java.util.Set;
import java.util.TreeSet;

public class TreeSett {
    
    public static void main(String[] args) {
        Set<String> sett = new TreeSet<>(new StringComparator());

        sett.add("Carlos");
        sett.add("Carol");
        sett.add("Luis");
        sett.add("Kattya");

        for (String obj : sett) {
            System.out.println(obj);
        }
    }
}
