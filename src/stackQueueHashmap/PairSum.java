package stackQueueHashmap;

import java.util.HashSet;

public class PairSum {

    // Method to check if any pair sums to target
    static boolean hasPair(int arr[], int target){

        // HashSet to store visited elements
        HashSet<Integer> set = new HashSet<>();

        // Traverse each element in array
        for(int num : arr){

            // Check if complement (target - num) exists in set
            if(set.contains(target - num))

                // Pair found
                return true;

            // Add current element to set
            set.add(num);
        }

        // No pair found
        return false;
    }

    public static void main(String[] args) {

        // Sample array
        int arr[] = {1, 4, 45, 6, 10, 8};

        // Check if any pair sums to 16
        System.out.println(hasPair(arr, 16));
    }
}