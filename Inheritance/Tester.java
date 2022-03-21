package Inheritance;

public class Tester extends Employee{

    String[] tools;

    public Tester(int id, String name, String dept, Double sal, String[] tools) {
        super(id, name, dept, sal);
        this.tools = tools;
    }
    
    @Override
    protected void work() {
        
        super.work();
        
        for(int i =0; i<tools.length; i++){
            System.out.println("Tester is working using "+tools[i]);
        }
    }
}
