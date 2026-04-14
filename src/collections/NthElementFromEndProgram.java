package collections;

import java.util.*;

public class NthElementFromEndProgram {

    public static void main(String[] args) {

        // Create LinkedList with elements
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));

        // Position from end (n = 2 means 2nd element from end)
        int n = 2;

        // Two pointers (indices)
        int fast = 0, slow = 0;

        // Move fast pointer through the list
        while(fast < list.size()) {

            // Maintain gap of n elements between fast and slow
            if(fast - slow > n - 1) {

                // Move slow pointer forward
                slow++;
            }

            // Move fast pointer forward
            fast++;
        }

        // Print nth element from end
        System.out.println(list.get(slow));
    }
}