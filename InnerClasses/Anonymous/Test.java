package InnerClasses.Anonymous;

public class Test {
    
    public static void main(String[] args) {
        Connections con = DriverManager.getConnection();
        con.createStatement();
    }
}
