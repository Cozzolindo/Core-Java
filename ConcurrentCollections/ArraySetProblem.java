package ConcurrentCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySetProblem extends Thread {
    
    static ConcurrentHashMap<String, String> courseRatings = new ConcurrentHashMap<String, String>();

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        courseRatings.put("Java", "4.0");
        
        courseRatings.put("C", "3.5");
        courseRatings.put("C#", "4.5");
        
        
    }
        
        
    public static void main(String[] args) throws InterruptedException {
        
        ArraySetProblem arrayListProblem = new ArraySetProblem();
        arrayListProblem.start();

        courseRatings.put("Python", "5.0");
        

        Iterator<String> iterator = courseRatings.keySet().iterator();

        while(iterator.hasNext()){
            Thread.sleep(1000);
            String course = iterator.next();
            System.out.println(courseRatings.get(course));
        }

        System.out.println(courseRatings);
    }
    
}
