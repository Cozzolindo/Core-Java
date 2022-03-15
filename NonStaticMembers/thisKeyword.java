package NonStaticMembers;

public class thisKeyword {
    
    int x;

    thisKeyword(){
        System.out.println(this);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        new thisKeyword();
        new thisKeyword();
    }
}
