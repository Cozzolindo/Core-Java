package Java8.MethodRef.Filters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLower {
    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Guilherme");
        list.add("Ana");
        list.add("Beatriz");

        List<String> collect = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
        List<String> sort = collect.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);
    }
}
