package collections;

import java.util.*;

public class SetToSortedListProgram {

    public static void main(String[] args) {

        // Create a set with elements (unordered, unique values)
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Convert set to list
        List<Integer> list = new ArrayList<>(set);

        // Sort the list in ascending order
        Collections.sort(list);

        // Print sorted list
        System.out.println(list);
    }
}