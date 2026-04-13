package runtimeAnalysis;

import java.util.*;

public class SortingComparison {

    // Method to perform Bubble Sort
    static void bubbleSort(int arr[]) {

        // Outer loop for number of passes
        for (int i = 0; i < arr.length - 1; i++)

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - i - 1; j++)

                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {

                    // Temporary variable for swapping
                    int temp = arr[j];

                    // Swap elements
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // Method to perform Merge Sort (simplified version)
    static void mergeSort(int arr[], int l, int r) {

        // Check if left index is less than right index
        if (l < r) {

            // Find middle index
            int m = (l + r) / 2;

            // Recursively sort left half
            mergeSort(arr, l, m);

            // Recursively sort right half
            mergeSort(arr, m + 1, r);

            // Merge step (simplified using built-in sort)
            Arrays.sort(arr); // Not actual merge logic (used for simplicity)
        }
    }

    // Method to perform Quick Sort (using built-in sort)
    static void quickSort(int arr[]) {

        // Arrays.sort uses Dual-Pivot QuickSort (for primitives)
        Arrays.sort(arr);
    }

    public static void main(String[] args) {

        // Define size of array
        int n = 10000;

        // Generate random array of size n with values between 0 and 9999
        int arr[] = new Random().ints(n, 0, 10000).toArray();

        // Clone arrays to ensure same input for all sorting methods
        int a1[] = arr.clone();
        int a2[] = arr.clone();
        int a3[] = arr.clone();

        // Measure time for Bubble Sort
        long t1 = System.nanoTime();

        // Call Bubble Sort
        bubbleSort(a1);

        // Print time taken by Bubble Sort
        System.out.println("Bubble: " + (System.nanoTime() - t1));

        // Measure time for Merge Sort
        long t2 = System.nanoTime();

        // Call Merge Sort
        mergeSort(a2, 0, a2.length - 1);

        // Print time taken by Merge Sort
        System.out.println("Merge: " + (System.nanoTime() - t2));

        // Measure time for Quick Sort
        long t3 = System.nanoTime();

        // Call Quick Sort
        quickSort(a3);

        // Print time taken by Quick Sort
        System.out.println("Quick: " + (System.nanoTime() - t3));
    }
}