package Collections.List.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
 
    public static void main(String[] args) {
        
        Map<String,Integer> map = new HashMap<>();

        map.put("Carlos", 26);
        map.put("Luis", 24);
        map.put("Carol", 26);
        map.put("Kattya", 22);

        Set<String> keySet = map.keySet();
        System.out.println("Keys" + keySet);

        Collection<Integer> values = map.values();
        System.out.println("Values" + values);

        for (String key : keySet) {
            System.out.println("Key: "+key+"\nValue: "+map.get(key));
        }

    }
}
