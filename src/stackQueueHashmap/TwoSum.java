package stackQueueHashmap;

import java.util.HashMap;

public class TwoSum {

    // Method to find indices of two numbers that add up to target
    static void findTwoSum(int arr[], int target) {

        // HashMap to store value → index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse array
        for(int i = 0; i < arr.length; i++){

            // Calculate complement needed to reach target
            int complement = target - arr[i];

            // Check if complement already exists in map
            if(map.containsKey(complement)){

                // Print indices of the two numbers
                System.out.println("Indices: " + map.get(complement) + " " + i);
                return;
            }

            // Store current element and its index in map
            map.put(arr[i], i);
        }
    }

    public static void main(String[] args) {

        // Input array
        int arr[] = {2, 7, 11, 15};

        // Find two numbers that sum to 9
        findTwoSum(arr, 9);
    }
}