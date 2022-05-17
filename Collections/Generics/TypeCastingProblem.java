package Collections.Generics;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {
    public static void main(String[] args) {
        String[] s = new String[10];
        s[0] = "Carlos";
        s[1] = "Cozzolino";
        //s[2] = 123; -> Error

        List<String> l = new ArrayList<>();
        l.add("Caro");
        l.add("Line");
        //l.add(26); -> Typecasting problem

        String name = (String)l.get(0);
        System.out.println(name);

    }
}
