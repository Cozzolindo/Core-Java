package Collections.List;

import java.util.LinkedList;

public class LinkedListDemo {
    
    public static void main(String[] args) {
        Object objects[] = new Object[1000000];

        for(int i = 0; i<objects.length; i++){
            objects[i] = new Object();
        }

        long start = System.currentTimeMillis();
        LinkedList<Object> list = new LinkedList<>();
        for (Object object : objects) {
            list.add(object);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time Taken: " +(end-start));
    }
}
