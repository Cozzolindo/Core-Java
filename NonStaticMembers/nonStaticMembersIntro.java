package NonStaticMembers;

public class nonStaticMembersIntro {
    int num;

    nonStaticMembersIntro(){
        System.out.println("Inside Constructor!");
    }

    {
        System.out.println("Non Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Inside Main");

        nonStaticMembersIntro obj = new nonStaticMembersIntro();
        obj.doSomething();
    }

    static{
        System.out.println("Inside Static Block");
    }

    void doSomething(){
        System.out.println("Do something");
    }
}
