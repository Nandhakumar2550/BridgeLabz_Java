package inbuild.level2;
import java.util.Scanner;

public class NumberGuessingGame {

    public static int generateGuess(int low, int high) {
        return (low + high) / 2;
        // Generates middle value (binary search approach)
    }

    public static String getFeedback(Scanner input) {
        System.out.print("Is the guess High, Low, or Correct? ");
        // Prompts user for feedback

        return input.next().toLowerCase();
        // Reads input and converts to lowercase
    }

    public static void playGame() {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object for input

        int low = 1, high = 100;
        // Defines search range

        boolean found = false;
        // Flag to check if correct guess is found

        while (!found && low <= high) {
            // Loop runs until number is found or range is exhausted

            int guess = generateGuess(low, high);
            // Generates guess

            System.out.println("Computer Guess: " + guess);
            // Displays guess

            String feedback = getFeedback(input);
            // Gets user feedback

            if (feedback.equals("correct")) {
                // If guess is correct

                System.out.println("Computer guessed correctly!");
                found = true;
                // Ends loop

            } else if (feedback.equals("high"))
                high = guess - 1;
                // Adjusts upper bound

            else if (feedback.equals("low"))
                low = guess + 1;
            // Adjusts lower bound
        }

        input.close();
        // Closes Scanner
    }

    public static void main(String[] args) {
        playGame();
        // Starts the game
    }
}