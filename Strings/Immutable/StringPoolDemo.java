package Strings.Immutable;

public class StringPoolDemo {
    
    public static void main(String[] args) {
        
        User user1 = new User(1, "abc");
        User user2 = new User(1, "abc");

        System.out.println(user1);
        System.out.println(user2);

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
;    }
}