package sorting;

public class InsertionSortEmployees {

    // Method to perform Insertion Sort
    static void insertionSort(int arr[]){

        // Start from second element (index 1)
        for(int i = 1; i < arr.length; i++){

            // Store current element as key
            int key = arr[i];

            // Initialize previous index
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while(j >= 0 && arr[j] > key){

                // Move element one step to the right
                arr[j + 1] = arr[j];

                // Move to previous element
                j--;
            }

            // Place key at correct position
            arr[j + 1] = key;
        }
    }

    // Method to print array elements
    static void print(int arr[]){

        // Iterate and print each element
        for(int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {

        // Array of employee IDs
        int ids[] = {105, 102, 110, 101, 108};

        // Sort using Insertion Sort
        insertionSort(ids);

        // Print sorted array
        print(ids);
    }
}