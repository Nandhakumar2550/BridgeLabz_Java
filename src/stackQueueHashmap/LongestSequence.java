package stackQueueHashmap;

import java.util.HashSet;

public class LongestSequence {

    // Method to find length of longest consecutive sequence
    static int longest(int arr[]){

        // HashSet to store unique elements for fast lookup
        HashSet<Integer> set = new HashSet<>();

        // Add all elements to the set
        for(int num : arr)
            set.add(num);

        // Variable to store longest sequence length
        int longest = 0;

        // Traverse each element
        for(int num : arr){

            // Check if it is the start of a sequence
            // (no previous element exists)
            if(!set.contains(num - 1)){

                // Start counting from current number
                int current = num;

                // Initialize count
                int count = 1;

                // Expand sequence forward
                while(set.contains(current + 1)){
                    current++;
                    count++;
                }

                // Update longest sequence length
                longest = Math.max(longest, count);
            }
        }

        // Return longest consecutive sequence length
        return longest;
    }

    public static void main(String[] args) {

        // Sample array
        int arr[] = {100, 4, 200, 1, 3, 2};

        // Print longest sequence length
        System.out.println(longest(arr));
    }
}