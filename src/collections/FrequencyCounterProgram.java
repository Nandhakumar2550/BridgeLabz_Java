package collections;

import java.util.*;

public class FrequencyCounterProgram {

    public static void main(String[] args) {

        // Create input list of strings
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        // Map to store frequency of each string
        Map<String, Integer> map = new HashMap<>();

        // Traverse each element in the list
        for(String s : list) {

            // Update frequency:
            // If key exists → increment value
            // Else → default value 0 + 1
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // Print the frequency map
        System.out.println(map);
    }
}