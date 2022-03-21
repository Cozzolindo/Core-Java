package Inheritance;

public class Test {
    public static void main(String[] args) {
        Manager Carl = new Manager(115086800, "Carlos Cozzolino", "Io", 1666.00, new String[] {"Mainframe"});

        System.out.println(Carl.id);
        System.out.println(Carl.name);
        System.out.println(Carl.dept);
        System.out.println(Carl.sal);
        Carl.work();
    }
}
