package Collections.Generics;

public class MyGenericClass<T> {
    
    T obj;

    MyGenericClass(T obj){
        this.obj = obj;
    }

    public void displayObjDetails(){
        System.out.println("Type of object is: "+ obj.getClass().getName());
    }

    public T getObj(){
        return obj;
    }
}
