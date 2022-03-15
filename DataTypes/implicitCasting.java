package DataTypes;



public class implicitCasting {
    public static byte b = 100;
    public static int i = b;
    static long l = i;
    static char ch = 'A';
    static int x = ch;

    static byte result = (byte)(b+i);
    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(x);
        System.out.println(result);
    }
}
