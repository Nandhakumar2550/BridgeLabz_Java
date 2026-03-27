package collections;

import java.util.*;

public class InvertMapProgram {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",1);

        Map<Integer,List<String>> result = new HashMap<>();

        // inverting map
        for(String key : map.keySet()) {
            int value = map.get(key);

            result.putIfAbsent(value, new ArrayList<>());
            result.get(value).add(key);
        }

        System.out.println(result);
    }
}
