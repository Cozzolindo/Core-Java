package Collections.List;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {
    
    public static void main(String[] args) {
        
        Set<StringBuffer> sett = new TreeSet<>();

        sett.add(new StringBuffer("Carlos"));
        sett.add(new StringBuffer("Carol"));
        sett.add(new StringBuffer("Luis"));
        sett.add(new StringBuffer("Kattya"));

        for (StringBuffer obj : sett) {
            System.out.println(obj);
        }
    }
}
