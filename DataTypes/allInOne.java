package DataTypes;

public class allInOne {
    
    static int x = 1000;
    static String y = Integer.toString(x);

    static Integer i = new Integer(y);
    static int z = i.intValue();

    static Integer c = new Integer(z);

     public static void main(String[] args) {
         System.out.println(c);
     }
}
