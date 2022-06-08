package ConcurrentCollections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySetProblem extends Thread {
    
    static CopyOnWriteArraySet<String> courses = new CopyOnWriteArraySet<String>();

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        courses.add("Java");
        
        courses.add("C");
        courses.add("C#");
        
        
    }
        
        
    public static void main(String[] args) throws InterruptedException {
        
        ArraySetProblem arrayListProblem = new ArraySetProblem();
        arrayListProblem.start();

        courses.add("Python");
        

        Iterator<String> iterator = courses.iterator();

        while(iterator.hasNext()){
            Thread.sleep(1000);
            String course = iterator.next();
            System.out.println(course);
        }

        System.out.println(courses);
    }
    
}
