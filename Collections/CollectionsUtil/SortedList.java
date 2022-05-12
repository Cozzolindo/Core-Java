package Collections.CollectionsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Collections.Comparator.*;

public class SortedList {
    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        
        list.add("Z");
        list.add("A");
        list.add("C");
        list.add("K");

        System.out.println("Before Sorting: "+ list);

        Collections.sort(list, new MyComparator());

        System.out.println("After Sorting: "+ list);

        Collections.sort(list, new MyComparator());

        int X = Collections.binarySearch(list, "K");

        System.out.println("Binary Search with K as key index:"+X);
    }
}
