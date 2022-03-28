package DaemonThreads;

public class DemoDaemon {
    
    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().isDaemon());

        ThreadDaemon threadDaemon = new ThreadDaemon();
        threadDaemon.setDaemon(true);
        System.out.println(threadDaemon.currentThread().isDaemon());
        threadDaemon.start();
    }
}
