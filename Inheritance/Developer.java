package Inheritance;

public class Developer extends Employee{

    String tech;

    public Developer(int id, String name, String dept, Double sal, String tech ) {
        super(id, name, dept, sal);
        this.tech = tech;
    }

    
    @Override
    protected void work() {
        
        super.work();
        System.out.println("Developer is working using "+ tech);
    }
    
    
}
