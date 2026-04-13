package stackQueueHashmap;

import java.util.*;

public class SlidingWindowMax {

    // Method to find maximum in each sliding window of size k
    static void maxWindow(int arr[], int k) {

        // Deque to store indices of useful elements
        Deque<Integer> dq = new LinkedList<>();

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            // Remove indices that are out of current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();

            // Remove elements smaller than current element from rear
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
                dq.pollLast();

            // Add current index to deque
            dq.offerLast(i);

            // Start printing results when first window is complete
            if (i >= k - 1)

                // Front of deque has index of maximum element
                System.out.print(arr[dq.peekFirst()] + " ");
        }
    }

    public static void main(String[] args) {

        // Input array
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};

        // Window size = 3
        maxWindow(arr, 3);
    }
}