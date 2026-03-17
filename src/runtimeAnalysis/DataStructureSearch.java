package runtimeAnalysis;

import java.util.*;

public class DataStructureSearch {

    public static void main(String[] args) {

        int n = 100000;

        int arr[] = new int[n];
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> tree = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            set.add(i);
            tree.add(i);
        }

        int target = n - 1;

        // Array
        long t1 = System.nanoTime();
        for (int num : arr)
            if (num == target) break;
        System.out.println("Array: " + (System.nanoTime() - t1));

        // HashSet
        long t2 = System.nanoTime();
        set.contains(target);
        System.out.println("HashSet: " + (System.nanoTime() - t2));

        // TreeSet
        long t3 = System.nanoTime();
        tree.contains(target);
        System.out.println("TreeSet: " + (System.nanoTime() - t3));
    }
}
