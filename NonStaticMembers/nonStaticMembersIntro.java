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

        new nonStaticMembersIntro();
    }
}
