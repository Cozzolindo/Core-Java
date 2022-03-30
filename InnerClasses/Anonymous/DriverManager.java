package InnerClasses.Anonymous;

public class DriverManager {
    

    static Connections getConnection(){
        Connections con = new Connections(){

            @Override
            public void createStatement(){

                System.out.println("Anonymous Inner Classes");
            }
        };

        return con;
    }

    
}
