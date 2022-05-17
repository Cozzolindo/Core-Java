package Collections.Generics;

public class TestGeneric {
    
    public static void main(String[] args) {
        MyGenericClass<String> s = new MyGenericClass<>("Cesar");

        s.displayObjDetails();
        System.out.println(s.getObj());

        MyGenericClass<Integer> i = new MyGenericClass<>(25);

        i.displayObjDetails();
        System.out.println(i.getObj());
    }
}
