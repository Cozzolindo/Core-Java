package NonStaticMembers;

public class demo {

    static demo obj;

    static{
        System.out.println(demo.obj);
        demo.obj = demo.init();
        
    }

    public static void main(String[] args) {
        System.out.println(demo.obj);
    }

    static demo init(){
        return new demo();
    }
}
