package ExecutorFramework;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{


    int num;

    public MyCallable(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+ " is calculating...");
        int sum = 0;

        for(int i = 0; i <= num; i++){
            sum+=i;
        }

        return sum;
    }

   
    


}
