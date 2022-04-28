package Collections.List.Sorting;

import java.util.Set;
import java.util.TreeSet;

public class Teste {
    
    public static void main(String[] args) {
        
        Set<Employee> sett = new TreeSet<>();
        sett.add(new Employee(1996, "Carol"));
        sett.add(new Employee(1995, "Carlos"));
        sett.add(new Employee(1997, "Luis"));
        sett.add(new Employee(1999, "Constancio"));

        for (Employee employee : sett) {
            System.out.println(employee.id);
            System.out.println(employee.name);
        }
    }
}
