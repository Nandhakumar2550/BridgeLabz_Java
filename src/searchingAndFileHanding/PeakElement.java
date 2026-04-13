package searchingAndFileHanding;

public class PeakElement {

    // Method to find a peak element using Binary Search
    static int findPeak(int arr[]){

        // Initialize left and right pointers
        int left = 0, right = arr.length - 1;

        // Continue until left and right converge
        while(left < right){

            // Find middle index
            int mid = (left + right) / 2;

            // If middle element is less than next element
            if(arr[mid] < arr[mid + 1])

                // Peak lies on right side
                left = mid + 1;

            else
                // Peak lies on left side (including mid)
                right = mid;
        }

        // Return the peak element value
        return arr[left];
    }

    public static void main(String[] args) {

        // Sample array
        int arr[] = {1, 3, 20, 4, 1};

        // Print peak element
        System.out.println(findPeak(arr));
    }
}