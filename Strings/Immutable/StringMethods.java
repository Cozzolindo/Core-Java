package Strings.Immutable;

public class StringMethods {
    
    public static void main(String[] args) {
        
        String s = "Hello World, how are you?";
        System.out.println(s.length()  + " is the length of string: " + s);
        System.out.println(s.indexOf("o") + " is the index of char." + s.charAt(4));
        System.out.println(s.charAt(4));

        System.out.println(s.substring(2)+" is  a Sub with begining index");
        System.out.println(s.substring(1, 3)+ " is a sub with begining and ending index"); 
        
        String n[] = s.split(" ");
        for(int i = 0; i<n.length; i++){
            System.out.println(n[i]);
        }

        String rep = s.replace("o", "Carol");

        System.out.println(rep);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
}
