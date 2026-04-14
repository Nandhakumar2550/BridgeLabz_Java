package collections;

import java.util.*;

public class SetEqualityProgram {

    public static void main(String[] args) {

        // Create first set
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));

        // Create second set (same elements, different order)
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 2, 1));

        // Check if both sets are equal
        // equals() compares elements, not order
        System.out.println(s1.equals(s2));
    }
}