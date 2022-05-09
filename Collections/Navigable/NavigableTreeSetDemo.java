package Collections.Navigable;

import java.util.TreeSet;

public class NavigableTreeSetDemo {
    
    public static void main(String[] args) {
        
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(40);
        ts.add(20);
        ts.add(30);
        

        System.out.println(ts);

        System.out.println("+============================+");
        System.out.println(ts.ceiling(0));
        System.out.println("+============================+");
        System.out.println(ts.higher(25));
        System.out.println("+============================+");
        System.out.println(ts.floor(20));
        System.out.println("+============================+");
        System.out.println(ts.descendingSet());
        System.out.println("+============================+");
        System.out.println(ts.pollFirst());
        System.out.println("+============================+");
        System.out.println(ts.pollLast());
    }


}
