package ConcurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem extends Thread {
    
    static CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<String>();

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        courses.add("Java");
        
        courses.add("C");
        courses.add("C#");
        
        
    }
    public static void main(String[] args) throws InterruptedException {
        
        ArrayListProblem arrayListProblem = new ArrayListProblem();
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
