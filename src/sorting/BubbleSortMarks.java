package sorting;

public class BubbleSortMarks {

    // Method to perform Bubble Sort
    static void bubbleSort(int arr[]) {

        // Get length of array
        int n = arr.length;

        // Outer loop for number of passes
        for(int i = 0; i < n - 1; i++){

            // Inner loop for comparing adjacent elements
            for(int j = 0; j < n - i - 1; j++){

                // If current element is greater than next element
                if(arr[j] > arr[j + 1]){

                    // Swap elements using temporary variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print array elements
    static void printArray(int arr[]){

        // Iterate through array and print each element
        for(int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {

        // Array of marks
        int marks[] = {78, 45, 90, 62, 88};

        // Sort the array using Bubble Sort
        bubbleSort(marks);

        // Print sorted array
        printArray(marks);
    }
}