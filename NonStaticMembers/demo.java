package NonStaticMembers;

public class demo {

    static demo obj;
    static{
        System.out.println(demo.obj);
        demo.obj = new demo();
        
    }

    public static void main(String[] args) {
        System.out.println(demo.obj);
    }
}
