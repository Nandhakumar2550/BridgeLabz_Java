package sorting;

public class SelectionSortScores {

    // Method to perform Selection Sort
    static void selectionSort(int arr[]){

        // Traverse the array
        for(int i = 0; i < arr.length - 1; i++){

            // Assume current index has minimum value
            int minIndex = i;

            // Find index of minimum element in remaining array
            for(int j = i + 1; j < arr.length; j++){

                // Update minIndex if smaller element is found
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }

            // Swap the found minimum element with current position
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print array elements
    static void print(int arr[]){

        // Iterate and print each element
        for(int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {

        // Array of scores
        int scores[] = {85, 72, 90, 60, 88};

        // Sort using Selection Sort
        selectionSort(scores);

        // Print sorted scores
        print(scores);
    }
}