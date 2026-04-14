package collections;

import java.util.*;

public class ReverseListProgram {

    public static void main(String[] args) {

        // Create ArrayList with elements
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Reverse ArrayList manually using two-pointer approach
        for(int i = 0, j = list.size() - 1; i < j; i++, j--) {

            // Store element at index i
            int temp = list.get(i);

            // Replace element at i with element at j
            list.set(i, list.get(j));

            // Replace element at j with temp
            list.set(j, temp);
        }

        // Print reversed ArrayList
        System.out.println(list);

        // Create LinkedList with elements
        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Reverse LinkedList manually using same logic
        for(int i = 0, j = l.size() - 1; i < j; i++, j--) {

            // Store element at index i
            int temp = l.get(i);

            // Replace element at i with element at j
            l.set(i, l.get(j));

            // Replace element at j with temp
            l.set(j, temp);
        }

        // Print reversed LinkedList
        System.out.println(l);
    }
}