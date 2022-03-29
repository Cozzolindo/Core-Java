package ExecutorFramework;

public class ExecutorFramework  implements Runnable{
    
    String name;

    public ExecutorFramework(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "Check Processor has begun" + Thread.currentThread().getName());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + "Check Processor has ended" + Thread.currentThread().getName());
    }
}
