package arrays.level1;
import java.util.*;

public class MeanHeightCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        double[] heights = new double[11];
        // Array to store heights of 11 players

        double sum = 0.0;
        // Variable to store total height

        for (int i = 0; i < heights.length; i++) {

            System.out.print("Enter height of player " + (i + 1) + ": ");
            // Prompts user for each player

            heights[i] = input.nextDouble();
            // Stores height in array
        }

        for (int i = 0; i < heights.length; i++) {

            sum += heights[i];
            // Adds each height to total sum
        }

        double mean = sum / heights.length;
        // Calculates mean height

        System.out.println("The mean height of the football team is " + mean);
        // Displays mean height

        input.close();
        // Closes Scanner
    }
}