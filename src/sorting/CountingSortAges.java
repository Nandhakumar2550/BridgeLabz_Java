package sorting;

public class CountingSortAges {

    // Method to perform Counting Sort
    static void countingSort(int arr[]){

        // Maximum possible value in array (age limit)
        int max = 18;

        // Create count array of size max+1 to store frequencies
        int count[] = new int[max + 1];

        // Count frequency of each element
        for(int num : arr)
            count[num]++;

        // Index to place elements back into original array
        int index = 0;

        // Traverse count array
        for(int i = 0; i <= max; i++){

            // Place element i into array as many times as it appears
            while(count[i] > 0){

                arr[index++] = i; // insert element
                count[i]--;       // decrease frequency
            }
        }
    }

    // Method to print array elements
    static void print(int arr[]){

        // Iterate and print each element
        for(int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {

        // Array of ages
        int ages[] = {15, 12, 18, 14, 12, 16};

        // Sort using Counting Sort
        countingSort(ages);

        // Print sorted array
        print(ages);
    }
}