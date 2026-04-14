package collections;

import java.util.*;

public class MaxValueKeyProgram {

    public static void main(String[] args) {

        // Create map to store key → value pairs
        Map<String, Integer> map = new HashMap<>();

        // Add entries to map
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        // Variable to store key with maximum value
        String maxKey = null;

        // Initialize max with smallest possible integer
        int max = Integer.MIN_VALUE;

        // Traverse each key in map
        for(String key : map.keySet()) {

            // Check if current value is greater than max
            if(map.get(key) > max) {

                // Update max value
                max = map.get(key);

                // Update corresponding key
                maxKey = key;
            }
        }

        // Print key having maximum value
        System.out.println(maxKey);
    }
}