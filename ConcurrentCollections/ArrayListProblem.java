package ConcurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProblem {
    
    public static void main(String[] args) {
        
        ArrayList<String> courses = new ArrayList<String>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C");
        courses.add("C#");

        Iterator<String> iterator = courses.iterator();

        while(iterator.hasNext()){
            
            System.out.println(iterator.next());
            String course = iterator.next();
            System.out.println(course);
            if(course.equals("C")){
                courses.remove(course);
            }
            
        }
    }
}
