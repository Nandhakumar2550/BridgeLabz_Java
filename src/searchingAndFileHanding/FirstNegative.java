
package searchingAndFileHanding;

public class FirstNegative {

    // Method to find index of first negative number
    static int find(int arr[]){

        // Traverse the array from start
        for(int i = 0; i < arr.length; i++){

            // Check if current element is negative
            if(arr[i] < 0)

                // Return index of first negative element
                return i;
        }

        // If no negative number is found, return -1
        return -1;
    }

    public static void main(String[] args) {

        // Sample array
        int arr[] = {5, 3, -2, 9};

        // Print index of first negative number
        System.out.println(find(arr));
    }
}