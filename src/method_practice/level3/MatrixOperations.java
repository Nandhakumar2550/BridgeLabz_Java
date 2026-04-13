package method_practice.level3;
import java.util.Random;

public class MatrixOperations {

    public static int[][] generateMatrix(int rows, int cols) {

        Random random = new Random();
        // Creates Random object

        int[][] matrix = new int[rows][cols];
        // Creates matrix with given size

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = random.nextInt(10);
        // Fills matrix with random values (0–9)

        return matrix;
        // Returns generated matrix
    }

    public static int[][] add(int[][] A, int[][] B) {

        int[][] result = new int[A.length][A[0].length];
        // Creates result matrix

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] + B[i][j];
        // Adds corresponding elements

        return result;
        // Returns sum matrix
    }

    public static int[][] multiply(int[][] A, int[][] B) {

        int[][] result = new int[A.length][B[0].length];
        // Creates result matrix

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B[0].length; j++)
                for (int k = 0; k < B.length; k++)
                    result[i][j] += A[i][k] * B[k][j];
        // Performs matrix multiplication

        return result;
        // Returns product matrix
    }

    public static int[][] transpose(int[][] A) {

        int[][] result = new int[A[0].length][A.length];
        // Creates transposed matrix

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[j][i] = A[i][j];
        // Swaps rows and columns

        return result;
        // Returns transpose
    }

    public static void display(int[][] matrix) {

        for (int[] row : matrix) {
            // Iterates each row

            for (int val : row)
                System.out.print(val + " ");
            // Prints each value

            System.out.println();
            // Moves to next row
        }
        System.out.println();
        // Adds spacing after matrix
    }

    public static void main(String[] args) {

        int[][] A = generateMatrix(2,2);
        // Generates 2x2 matrix A

        int[][] B = generateMatrix(2,2);
        // Generates 2x2 matrix B

        System.out.println("Matrix A:");
        display(A);
        // Displays matrix A

        System.out.println("Matrix B:");
        display(B);
        // Displays matrix B

        System.out.println("Addition:");
        display(add(A,B));
        // Displays A + B

        System.out.println("Multiplication:");
        display(multiply(A,B));
        // Displays A × B

        System.out.println("Transpose of A:");
        display(transpose(A));
        // Displays transpose of A
    }
}