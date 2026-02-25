package method_practice.level3;
import java.util.Random;
public class MatrixOperations {
    public static int[][] generateMatrix(int rows, int cols) {

        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = random.nextInt(10);

        return matrix;
    }

    public static int[][] add(int[][] A, int[][] B) {

        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] + B[i][j];

        return result;
    }

    public static int[][] multiply(int[][] A, int[][] B) {

        int[][] result = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B[0].length; j++)
                for (int k = 0; k < B.length; k++)
                    result[i][j] += A[i][k] * B[k][j];

        return result;
    }

    public static int[][] transpose(int[][] A) {

        int[][] result = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[j][i] = A[i][j];

        return result;
    }

    public static void display(int[][] matrix) {

        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] A = generateMatrix(2,2);
        int[][] B = generateMatrix(2,2);

        System.out.println("Matrix A:");
        display(A);

        System.out.println("Matrix B:");
        display(B);

        System.out.println("Addition:");
        display(add(A,B));

        System.out.println("Multiplication:");
        display(multiply(A,B));

        System.out.println("Transpose of A:");
        display(transpose(A));
    }
}
