package arrays.level2;
import java.util.*;

public class FriendAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        String[] names = {"Amar", "Akbar", "Anthony"};
        // Array storing friend names

        int[] ages = new int[3];
        // Array to store ages

        double[] heights = new double[3];
        // Array to store heights

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter age of " + names[i] + ": ");
            // Prompts for age

            ages[i] = input.nextInt();
            // Stores age

            System.out.print("Enter height of " + names[i] + ": ");
            // Prompts for height

            heights[i] = input.nextDouble();
            // Stores height
        }

        int youngestIndex = 0;
        // Assume first person is youngest

        int tallestIndex = 0;
        // Assume first person is tallest

        for (int i = 1; i < 3; i++) {

            if (ages[i] < ages[youngestIndex]) {
                // Check for youngest

                youngestIndex = i;
                // Update index
            }

            if (heights[i] > heights[tallestIndex]) {
                // Check for tallest

                tallestIndex = i;
                // Update index
            }
        }

        System.out.println("Youngest friend is " + names[youngestIndex]);
        // Displays youngest friend

        System.out.println("Tallest friend is " + names[tallestIndex]);
        // Displays tallest friend

        input.close();
        // Closes Scanner
    }
}