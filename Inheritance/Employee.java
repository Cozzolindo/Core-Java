package Inheritance;

public class Employee {
    
    int id;
    String name;
    String dept;
    Double sal;


    public Employee(int id, String name, String dept, Double sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }

    protected void work(){
        System.out.println("Common Work for Everyone!");
    }

}
