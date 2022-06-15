package Java8.MethodRef.Filters;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenNumbers {
    
    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0; i<=10;i++){
            list.add(rand.nextInt(20));
        }
        for (Integer integer : list) {
            
            if(integer%2==0){
                System.out.println(integer + " it's even!");
            }else{
                System.out.println(integer);
            }
        }

        List<Integer> collect = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(collect);
        long count = list.stream().filter(i->i%2==0).count();
        System.out.println(count);

        Comparator<Integer> comp = (i,j)->i.compareTo(j);
        List<Integer> sort = list.stream().sorted(comp).collect(Collectors.toList());
        System.out.println(sort);

        Integer max = list.stream().max(comp).get();
        System.out.println(max);
        Integer min = list.stream().min(comp).get();
        System.out.println(min);
    }
}
