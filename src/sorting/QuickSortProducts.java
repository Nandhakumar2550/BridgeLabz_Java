package sorting;

public class QuickSortProducts {

    // Partition method to place pivot at correct position
    static int partition(int arr[], int low, int high){

        // Choose last element as pivot
        int pivot = arr[high];

        // Index of smaller element
        int i = low - 1;

        // Traverse array from low to high-1
        for(int j = low; j < high; j++){

            // If current element is smaller than pivot
            if(arr[j] < pivot){

                // Increment index of smaller element
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct sorted position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i + 1;
    }

    // Quick Sort method
    static void quickSort(int arr[], int low, int high){

        // Check if array has more than one element
        if(low < high){

            // Partition the array and get pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before pivot
            quickSort(arr, low, pi - 1);

            // Recursively sort elements after pivot
            quickSort(arr, pi + 1, high);
        }
    }

    // Method to print array elements
    static void print(int arr[]){

        // Iterate and print each element
        for(int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {

        // Array of product prices
        int prices[] = {1200, 800, 450, 300, 900};

        // Sort using Quick Sort
        quickSort(prices, 0, prices.length - 1);

        // Print sorted array
        print(prices);
    }
}