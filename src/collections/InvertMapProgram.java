package collections;

import java.util.*;

public class InvertMapProgram {

    public static void main(String[] args) {

        // Original map (key → value)
        Map<String, Integer> map = new HashMap<>();

        // Add entries to map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        // New map to store inverted result (value → list of keys)
        Map<Integer, List<String>> result = new HashMap<>();

        // Traverse each key in original map
        for(String key : map.keySet()) {

            // Get value corresponding to key
            int value = map.get(key);

            // If value not present, create new list
            result.putIfAbsent(value, new ArrayList<>());

            // Add key to list of that value
            result.get(value).add(key);
        }

        // Print inverted map
        System.out.println(result);
    }
}