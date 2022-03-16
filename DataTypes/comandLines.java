package DataTypes;

public class comandLines {
    
    
    public static void main(String[] args) {
        int length = args.length;
        if(length == 0){
            System.out.println("No input found.");
        }else{
            System.out.println("List of inputs:");
            for(int i = 0; i<length; i++){
                System.out.println(args[i]);
            }
        }
    }
}
