package NonStaticMembers;

public class objReference {
    
    int x;

    objReference(){

    }

    public static void main(String[] args) {
        objReference ord = new objReference();
        System.out.println(ord.x);
    }
}
