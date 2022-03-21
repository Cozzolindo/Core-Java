package Inheritance;

public class Manager extends Employee{

    String[] proj;

    public Manager(int id, String name, String dept, Double sal, String[] proj) {
        super(id, name, dept, sal);
        this.proj = proj;
    }
    
    @Override
    protected void work() {
        
        super.work();
        System.out.println("Manager is working on "+proj);
        for(int i =0; i<proj.length; i++){
            System.out.println(proj[i]);
        }
    }

}
