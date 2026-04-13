package stackQueueHashmap;

import java.util.HashMap;

public class ZeroSumSubarray {

    // Method to check if a subarray with sum 0 exists
    static boolean hasZeroSum(int arr[]){

        // HashMap to store prefix sums
        HashMap<Integer, Integer> map = new HashMap<>();

        // Variable to store running sum
        int sum = 0;

        // Traverse each element
        for(int num : arr){

            // Add current element to running sum
            sum += num;

            // If sum becomes 0 OR sum already seen before
            if(sum == 0 || map.containsKey(sum))

                // Zero sum subarray exists
                return true;

            // Store current sum in map
            map.put(sum, 1);
        }

        // No zero sum subarray found
        return false;
    }

    public static void main(String[] args) {

        // Sample array
        int arr[] = {4, 2, -3, 1, 6};

        // Check and print result
        System.out.println(hasZeroSum(arr));
    }
}