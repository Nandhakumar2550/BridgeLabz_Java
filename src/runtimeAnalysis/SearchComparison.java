package runtimeAnalysis;

import java.util.*;

public class SearchComparison {

    // Method to perform linear search
    static int linearSearch(int arr[], int target) {

        // Traverse each element in the array
        for (int i = 0; i < arr.length; i++)

            // If target is found, return its index
            if (arr[i] == target)
                return i;

        // If target is not found, return -1
        return -1;
    }

    // Method to perform binary search (array must be sorted)
    static int binarySearch(int arr[], int target) {

        // Initialize left and right pointers
        int left = 0, right = arr.length - 1;

        // Continue searching while left pointer is less than or equal to right
        while (left <= right) {

            // Find middle index to avoid overflow
            int mid = left + (right - left) / 2;

            // If middle element matches target, return index
            if (arr[mid] == target)
                return mid;

                // If target is greater, search in right half
            else if (arr[mid] < target)
                left = mid + 1;

                // If target is smaller, search in left half
            else
                right = mid - 1;
        }

        // If target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {

        // Define size of array
        int n = 100000;

        // Create array of size n
        int arr[] = new int[n];

        // Initialize array with sorted values (0 to n-1)
        for (int i = 0; i < n; i++)
            arr[i] = i;

        // Target element to search
        int target = n - 1;

        // Start time for linear search
        long start = System.nanoTime();

        // Call linear search method
        linearSearch(arr, target);

        // End time for linear search
        long end = System.nanoTime();

        // Print time taken by linear search
        System.out.println("Linear Search Time: " + (end - start));

        // Start time for binary search
        long start2 = System.nanoTime();

        // Call binary search method
        binarySearch(arr, target);

        // End time for binary search
        long end2 = System.nanoTime();

        // Print time taken by binary search
        System.out.println("Binary Search Time: " + (end2 - start2));
    }
}