package ConcurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem {
    
    public static void main(String[] args) {
        
        CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<String>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C");
        courses.add("C#");

        Iterator<String> iterator = courses.iterator();

        while(iterator.hasNext()){
            String course = iterator.next();
            
            if(course.equals("C")){
                courses.remove(course);
            }
        }

        System.out.println(courses);
    }
}
