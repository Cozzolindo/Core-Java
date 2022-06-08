package ConcurrentCollections;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable{


    private BlockingQueue<String> queue;

    public OrderProducer(BlockingQueue<String> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            queue.put("Thinkpad");
            queue.put("Tesla");
            queue.put("Mac Book");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
