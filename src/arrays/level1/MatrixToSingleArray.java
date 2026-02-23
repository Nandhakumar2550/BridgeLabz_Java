package arrays.level1;
import java.util.*;
public class MatrixToSingleArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rows;
        int columns;

        System.out.print("Enter number of rows: ");
        rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        int[] singleArray = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                singleArray[index] = matrix[i][j];
                index++;
            }
        }

        System.out.println("Single Dimension Array:");

        for (int i = 0; i < singleArray.length; i++) {
            System.out.println(singleArray[i]);
        }
    }
}
