package sorting;

public class HeapSortSalary {

    // Method to maintain max-heap property
    static void heapify(int arr[], int n, int i){

        // Assume current index is largest
        int largest = i;

        // Calculate left child index
        int left = 2 * i + 1;

        // Calculate right child index
        int right = 2 * i + 2;

        // If left child exists and is greater than current largest
        if(left < n && arr[left] > arr[largest])
            largest = left;

        // If right child exists and is greater than current largest
        if(right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if(largest != i){

            // Swap root with largest child
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Method to perform Heap Sort
    static void heapSort(int arr[]){

        // Get size of array
        int n = arr.length;

        // Build max heap (rearrange array)
        for(int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Extract elements from heap one by one
        for(int i = n - 1; i >= 0; i--){

            // Move current root (largest) to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on reduced heap
            heapify(arr, i, 0);
        }
    }

    // Method to print array elements
    static void print(int arr[]){

        // Iterate and print each element
        for(int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {

        // Array of salaries
        int salary[] = {50000, 70000, 45000, 80000, 60000};

        // Sort array using Heap Sort
        heapSort(salary);

        // Print sorted salaries
        print(salary);
    }
}