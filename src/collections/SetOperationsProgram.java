package collections;

import java.util.*;

public class SetOperationsProgram {

    public static void main(String[] args) {

        // Create first set
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));

        // Create second set
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Create union set (contains all elements from both sets)
        Set<Integer> union = new HashSet<>(s1);

        // Add all elements of s2 into union
        union.addAll(s2);

        // Create intersection set (common elements)
        Set<Integer> inter = new HashSet<>(s1);

        // Retain only elements present in s2
        inter.retainAll(s2);

        // Print union result
        System.out.println("Union: " + union);

        // Print intersection result
        System.out.println("Intersection: " + inter);
    }
}