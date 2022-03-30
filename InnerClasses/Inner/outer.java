package InnerClasses.Inner;

import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class outer {
    
    static void f1(){
        System.out.println("Outers Static Method");
    }
    static class Inner{
        static void f2(){
            System.out.println("Inners Static Method");
        }
    }
    public static void main(String[] args) {
        
        outer.f1();
        outer.Inner.f2();
    }
}
