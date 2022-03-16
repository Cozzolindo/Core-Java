package DataTypes;

public class objectAndString {
    
    long x = 1000;
    Long y = Long.valueOf(x); // <-- Object

    String s = y.toString();

    Long z = Long.valueOf(s);// <-- Object
}
