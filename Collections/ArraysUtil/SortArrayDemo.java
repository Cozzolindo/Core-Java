package Collections.ArraysUtil;

import java.util.Arrays;

import Collections.Comparator.MyComparator;

public class SortArrayDemo {
    
    public static void main(String[] args) {
        int[] a = {10,-30,50,-70};
        System.out.println("Before Sorting: ");
        for (int eachElem : a) {
            System.out.println(eachElem);
        }

        Arrays.sort(a);
        System.out.println("After Sorting: ");
        for (int eachElem : a) {
            System.out.println(eachElem);
        }

        String[] s = {"B","C","Z","A"};
        System.out.println("After sorting:");
        Arrays.sort(s, new MyComparator());
        for (String eachString : s) {
            System.out.println(eachString);
        }
    }
}
