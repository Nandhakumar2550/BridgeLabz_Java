package searchingAndFileHanding;

public class MatrixSearch {

    // Method to search target in a 2D sorted matrix
    static boolean search(int matrix[][], int target){

        // Number of rows in matrix
        int rows = matrix.length;

        // Number of columns in matrix
        int cols = matrix[0].length;

        // Treat matrix as a flattened sorted array
        int left = 0, right = rows * cols - 1;

        // Perform binary search
        while(left <= right){

            // Find middle index
            int mid = (left + right) / 2;

            // Convert 1D index to 2D row index
            int r = mid / cols;

            // Convert 1D index to 2D column index
            int c = mid % cols;

            // Check if element matches target
            if(matrix[r][c] == target)
                return true;

                // If target is greater, search right half
            else if(matrix[r][c] < target)
                left = mid + 1;

                // If target is smaller, search left half
            else
                right = mid - 1;
        }

        // Target not found
        return false;
    }

    public static void main(String[] args) {

        // 2D sorted matrix (row-wise and overall sorted)
        int matrix[][] = {
                {1, 3, 5},
                {7, 9, 11}
        };

        // Search for target value (9)
        System.out.println(search(matrix, 9));
    }
}