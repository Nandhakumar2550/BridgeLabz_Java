package searchingAndFileHanding;

public class FirstLastOccurrence {

    // Method to find first occurrence of target using Binary Search
    static int first(int arr[], int target){

        // Initialize pointers and answer variable
        int left = 0, right = arr.length - 1, ans = -1;

        // Continue search while left <= right
        while(left <= right){

            // Calculate middle index
            int mid = (left + right) / 2;

            // If target is found
            if(arr[mid] == target){

                // Store index as potential answer
                ans = mid;

                // Move left side to find earlier occurrence
                right = mid - 1;
            }

            // If target is greater, move right
            else if(arr[mid] < target)
                left = mid + 1;

                // If target is smaller, move left
            else
                right = mid - 1;
        }

        // Return first occurrence index (or -1 if not found)
        return ans;
    }

    // Method to find last occurrence of target using Binary Search
    static int last(int arr[], int target){

        // Initialize pointers and answer variable
        int left = 0, right = arr.length - 1, ans = -1;

        // Continue search while left <= right
        while(left <= right){

            // Calculate middle index
            int mid = (left + right) / 2;

            // If target is found
            if(arr[mid] == target){

                // Store index as potential answer
                ans = mid;

                // Move right side to find later occurrence
                left = mid + 1;
            }

            // If target is greater, move right
            else if(arr[mid] < target)
                left = mid + 1;

                // If target is smaller, move left
            else
                right = mid - 1;
        }

        // Return last occurrence index (or -1 if not found)
        return ans;
    }

    public static void main(String[] args) {

        // Sorted array with duplicate elements
        int arr[] = {1, 2, 2, 2, 3, 4};

        // Print first occurrence of target (2)
        System.out.println(first(arr, 2));

        // Print last occurrence of target (2)
        System.out.println(last(arr, 2));
    }
}