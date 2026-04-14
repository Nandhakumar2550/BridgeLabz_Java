package collections;

import java.util.*;

public class SubsetCheckProgram {

    public static void main(String[] args) {

        // Create first set (possible subset)
        Set<Integer> s1 = new HashSet<>(Arrays.asList(2, 3));

        // Create second set (main set)
        Set<Integer> s2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        // Check if s2 contains all elements of s1
        // If true → s1 is subset of s2
        System.out.println(s2.containsAll(s1));
    }
}