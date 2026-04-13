package arrays.level1;
import java.util.*;

public class MatrixToSingleArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        int rows;
        int columns;
        // Variables to store matrix size

        System.out.print("Enter number of rows: ");
        rows = input.nextInt();
        // Reads number of rows

        System.out.print("Enter number of columns: ");
        columns = input.nextInt();
        // Reads number of columns

        int[][] matrix = new int[rows][columns];
        // Creates 2D matrix

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print("Enter element [" + i + "][" + j + "]: ");
                // Prompts user for each element

                matrix[i][j] = input.nextInt();
                // Stores element in matrix
            }
        }

        int[] singleArray = new int[rows * columns];
        // Creates 1D array of required size

        int index = 0;
        // Tracks position in 1D array

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                singleArray[index] = matrix[i][j];
                // Copies element from 2D → 1D

                index++;
                // Moves to next position
            }
        }

        System.out.println("Single Dimension Array:");
        // Prints heading

        for (int i = 0; i < singleArray.length; i++) {
            System.out.println(singleArray[i]);
            // Displays elements of 1D array
        }

        input.close();
        // Closes Scanner
    }
}