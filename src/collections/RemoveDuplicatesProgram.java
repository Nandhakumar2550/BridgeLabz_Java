package collections;

import java.util.*;

public class RemoveDuplicatesProgram {

    public static void main(String[] args) {

        // Create input list with duplicate elements
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);

        // LinkedHashSet removes duplicates and maintains insertion order
        Set<Integer> set = new LinkedHashSet<>(list);

        // Convert set back to list
        List<Integer> result = new ArrayList<>(set);

        // Print list without duplicates
        System.out.println(result);
    }
}