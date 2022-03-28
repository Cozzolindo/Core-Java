package Multithreading.ThreadGroups;

public class GroupMethods {
    
    public static void main(String[] args) {
        
        ThreadGroup mtg = new ThreadGroup("MyThreadGroup");

        CustomThread customThread = new CustomThread(mtg, "Thread 1");
        CustomThread customThread2 = new CustomThread(mtg, "Thread 1");
        CustomThread customThread3 = new CustomThread(mtg, "Thread 1");

        customThread.start();
        customThread2.start();
        customThread3.start();

        customThread.setPriority(4);
        customThread2.setPriority(1);
        System.out.println(customThread.getPriority());
        System.out.println(customThread2.getPriority());
        System.out.println(customThread3.getPriority());
        System.out.println(mtg.activeCount());
        mtg.list();
    }
}
