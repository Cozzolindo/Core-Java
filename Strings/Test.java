package Strings;

public class Test {
    
    public static void main(String[] args) {
        
        Product product = new Product(1, "iPhone");

        System.out.println(product);
        System.out.println(product.getId());
        System.out.println(product.getName());

        String s = "123";
        Integer i = new Integer(456);

        System.out.println(s);
        System.out.println(i);
    }
}
