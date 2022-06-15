package Java8.MethodRef.Constructor;

public class TestClass {
    
    public static void main(String[] args) {
        
        MyInterface mi = s->new MyClass(s);
        mi.get(" Using Lambdas");

        MyInterface mi2 = MyClass::new;
        mi2.get(" Using Constructor Mapping");
    }
}
