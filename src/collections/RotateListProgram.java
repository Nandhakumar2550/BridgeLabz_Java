package collections;

import java.util.*;

public class RotateListProgram {

    public static void main(String[] args) {

        // Create list with elements
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        // Number of rotations (left rotation)
        int k = 2;

        // Perform rotation k times
        for(int i = 0; i < k; i++) {

            // Remove first element
            int first = list.remove(0);

            // Add removed element at the end
            list.add(first);
        }

        // Print rotated list
        System.out.println(list);
    }
}