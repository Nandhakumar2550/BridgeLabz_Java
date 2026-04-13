package runtimeAnalysis;

import java.util.*;

public class DataStructureSearch {

    public static void main(String[] args) {

        // Size of dataset
        int n = 100000;

        // Array declaration
        int arr[] = new int[n];

        // HashSet (unordered, fast lookup)
        HashSet<Integer> set = new HashSet<>();

        // TreeSet (sorted, balanced tree)
        TreeSet<Integer> tree = new TreeSet<>();

        // Populate all data structures
        for (int i = 0; i < n; i++) {

            // Fill array
            arr[i] = i;

            // Add to HashSet
            set.add(i);

            // Add to TreeSet
            tree.add(i);
        }

        // Target element to search
        int target = n - 1;

        // -------- Array Search (Linear Search) --------
        long t1 = System.nanoTime();

        // Traverse entire array
        for (int num : arr)
            if (num == target) break;

        // Print time taken
        System.out.println("Array: " + (System.nanoTime() - t1));

        // -------- HashSet Search --------
        long t2 = System.nanoTime();

        // O(1) average time lookup
        set.contains(target);

        // Print time taken
        System.out.println("HashSet: " + (System.nanoTime() - t2));

        // -------- TreeSet Search --------
        long t3 = System.nanoTime();

        // O(log n) lookup using balanced tree
        tree.contains(target);

        // Print time taken
        System.out.println("TreeSet: " + (System.nanoTime() - t3));
    }
}