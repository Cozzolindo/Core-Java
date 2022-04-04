package StringBuffer;

public class SBDemo {
    
    
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer();
        System.out.println("Initial Capacity: "+sb.capacity());

        sb.append("Purple Haze ");
        sb.append("Golden Experience ");

        System.out.println(sb);
        System.out.println("Current Capacity: "+sb.capacity());
        System.out.println("Insert Method: "+sb.insert(11,"Line"));
        System.out.println("Char at: "+sb.charAt(16));  
        System.out.println("Delete Method: "+sb.delete(10,20));
        System.out.println("Reverse Method: "+sb.reverse());
        System.out.println("Final Capacity: "+sb.capacity());
        
    }
}
