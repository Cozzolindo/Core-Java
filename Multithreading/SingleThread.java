package Multithreading;

public class SingleThread {
    
    public static void main(String[] args) {

        SingleThread st = new SingleThread();
        st.printNumbers();
        
        for(int i = 100; i>-1; i--){
            System.out.print(i+"\t");

        }
    }

    void printNumbers(){
        for(int i = 0; i<= 100; i++){
            System.out.print(i+"\t");

        }
    }
}
