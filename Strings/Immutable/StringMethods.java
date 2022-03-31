package Strings.Immutable;

public class StringMethods {
    
    public static void main(String[] args) {
        
        String s = "Hello";
        System.out.println(s.length()  + " is the length of string: " + s);
        System.out.println(s.indexOf("o") + " is the index of char.");
        System.out.println(s.charAt(4));

        System.out.println(s.substring(2)+" is  a Sub with begining index");
        System.out.println(s.substring(1, 3)+ " is a sub with begining and ending index");
    }
}
