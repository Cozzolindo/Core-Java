package Java8.Predicate;

import java.util.function.Predicate;

public class LengthOf {
    
    public static void main(String[] args) {
       
        Predicate<String> lengthOf = s->(s.length()>10);

        System.out.println(lengthOf.test("Ola,"));
        System.out.println(lengthOf.test("Sei que"));
        System.out.println(lengthOf.test("voce chegou"));
        System.out.println(lengthOf.test("tao longe,"));
        System.out.println(lengthOf.test("talvez esteja cansado,"));
        System.out.println(lengthOf.test("lendo codigos demais,"));
        System.out.println(lengthOf.test("ou sei la,"));
        System.out.println(lengthOf.test("so queria que soubesse"));
        System.out.println(lengthOf.test("que voce e especial"));
    }
}
