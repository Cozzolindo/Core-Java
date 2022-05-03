package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        System.out.println(q.peek());
        //System.out.println(q.element());
        int i = 0;
        while(i<10){
            q.offer(i);
            i++;
        }
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);
    }
}
