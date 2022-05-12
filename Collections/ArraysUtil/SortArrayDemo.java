package Collections.ArraysUtil;

import java.util.Arrays;

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
    }
}
