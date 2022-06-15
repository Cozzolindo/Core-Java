package Java8.MethodRef;

public class Classe {
    
    public void m1(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        
        MyInterface inter = i->System.out.println(i);
        inter.MyMethod(27);

        Classe c = new Classe();
        MyInterface inter2 = c::m1;
        inter2.MyMethod(26);
    }
}
