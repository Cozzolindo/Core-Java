package ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    
    public static void main(String[] args) {
        
        ExecutorFramework[] cp = {new ExecutorFramework("ATM"), new ExecutorFramework("Bank"), 
        new ExecutorFramework("Mobile"), new ExecutorFramework("Web")};

        ExecutorService service = Executors.newFixedThreadPool(3);

        for (ExecutorFramework executorFramework : cp) {
            service.submit(executorFramework);
        }

        service.shutdown();
    }
}
