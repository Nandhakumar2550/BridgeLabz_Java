package searchingAndFileHanding;

public class RotationPoint {

    // Method to find minimum element in a rotated sorted array
    static int findMin(int arr[]){

        // Initialize left and right pointers
        int left = 0, right = arr.length - 1;

        // Binary search loop
        while(left < right){

            // Find middle index (avoids overflow)
            int mid = left + (right - left) / 2;

            // If mid element is greater than rightmost element
            if(arr[mid] > arr[right])

                // Minimum lies in right half
                left = mid + 1;

            else
                // Minimum lies in left half (including mid)
                right = mid;
        }

        // Return minimum element (rotation point)
        return arr[left];
    }

    public static void main(String[] args) {

        // Rotated sorted array
        int arr[] = {4, 5, 6, 1, 2, 3};

        // Print minimum element
        System.out.println(findMin(arr));
    }
}