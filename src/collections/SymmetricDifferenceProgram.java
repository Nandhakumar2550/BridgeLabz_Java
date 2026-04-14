package collections;

import java.util.*;

public class SymmetricDifferenceProgram {

    public static void main(String[] args) {

        // Create first set
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));

        // Create second set
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Step 1: Create union of both sets
        Set<Integer> result = new HashSet<>(s1);

        // Add all elements of s2 to result (union)
        result.addAll(s2);

        // Step 2: Find intersection of both sets
        Set<Integer> temp = new HashSet<>(s1);

        // Retain only common elements
        temp.retainAll(s2);

        // Step 3: Remove intersection from union
        result.removeAll(temp);

        // Print symmetric difference
        System.out.println(result);
    }
}