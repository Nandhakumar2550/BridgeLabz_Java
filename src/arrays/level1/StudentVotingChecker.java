package arrays.level1;
import java.util.*;

public class StudentVotingChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object for input

        int[] ages = new int[10];
        // Array to store ages of 10 students

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            // Prompts user for each student's age

            ages[i] = input.nextInt();
            // Stores input age in array
        }

        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                // Checks for invalid (negative) age

                System.out.println("Invalid age: " + ages[i]);
            }
            else if (ages[i] >= 18) {
                // Checks if eligible to vote

                System.out.println("The student with the age " + ages[i] + " can vote.");
            }
            else {
                // If below 18 → not eligible

                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        input.close();
        // Closes Scanner
    }
}