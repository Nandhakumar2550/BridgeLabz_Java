package sorting;

public class MergeSortBooks {

    // Method to merge two sorted subarrays
    static void merge(int arr[], int left, int mid, int right){

        // Size of left subarray
        int n1 = mid - left + 1;

        // Size of right subarray
        int n2 = right - mid;

        // Create temporary arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data into left subarray
        for(int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        // Copy data into right subarray
        for(int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Initial indices for L, R, and merged array
        int i = 0, j = 0, k = left;

        // Merge the two arrays
        while(i < n1 && j < n2){

            // Compare elements and insert smaller one
            if(L[i] <= R[j])
                arr[k++] = L[i++];

            else
                arr[k++] = R[j++];
        }

        // Copy remaining elements of L (if any)
        while(i < n1)
            arr[k++] = L[i++];

        // Copy remaining elements of R (if any)
        while(j < n2)
            arr[k++] = R[j++];
    }

    // Method to perform Merge Sort
    static void mergeSort(int arr[], int left, int right){

        // Check if more than one element exists
        if(left < right){

            // Find middle index
            int mid = (left + right) / 2;

            // Recursively sort left half
            mergeSort(arr, left, mid);

            // Recursively sort right half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Method to print array elements
    static void print(int arr[]){

        // Iterate and print each element
        for(int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {

        // Array of book prices
        int prices[] = {450, 300, 800, 200, 600};

        // Sort using Merge Sort
        mergeSort(prices, 0, prices.length - 1);

        // Print sorted array
        print(prices);
    }
}