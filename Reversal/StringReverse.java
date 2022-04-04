package Reversal;

public class StringReverse {
    
    public String first(String actual){
        String reversed = "";
        for(int i = actual.length(); i>0; i--){
            reversed = reversed+actual.charAt(i-1);
        }
        return reversed;
    }

    public String second(String actual){
        byte[] one = actual.getBytes();
        byte[] two = new byte[one.length];

        for(int i = 0; i<one.length; i++){
            two[i] = one[one.length-i-1];
        }

        String reverse = new String(two);
        return reverse;
    }

    public static void main(String[] args) {
        String demo = "Coraline Xavier";
        StringReverse rev = new StringReverse();
        System.out.println(rev.first(demo));
        System.out.println(rev.second(demo));
    }
}
