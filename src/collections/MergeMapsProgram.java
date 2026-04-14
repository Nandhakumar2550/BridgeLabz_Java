package collections;

import java.util.*;

public class MergeMapsProgram {

    public static void main(String[] args) {

        // First map
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("A", 1);
        m1.put("B", 2);

        // Second map
        Map<String, Integer> m2 = new HashMap<>();
        m2.put("B", 3);
        m2.put("C", 4);

        // Merge m2 into m1
        for(String key : m2.keySet()) {

            // Add values:
            // If key exists → sum values
            // Else → use default 0
            m1.put(key, m1.getOrDefault(key, 0) + m2.get(key));
        }

        // Print merged map
        System.out.println(m1);
    }
}