package inbuild.level2;
import java.util.Scanner;
public class NumberGuessingGame {
    public static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }

    public static String getFeedback(Scanner input) {
        System.out.print("Is the guess High, Low, or Correct? ");
        return input.next().toLowerCase();
    }

    public static void playGame() {

        Scanner input = new Scanner(System.in);

        int low = 1, high = 100;
        boolean found = false;

        while (!found && low <= high) {

            int guess = generateGuess(low, high);
            System.out.println("Computer Guess: " + guess);

            String feedback = getFeedback(input);

            if (feedback.equals("correct")) {
                System.out.println("Computer guessed correctly!");
                found = true;
            }
            else if (feedback.equals("high"))
                high = guess - 1;
            else if (feedback.equals("low"))
                low = guess + 1;
        }
    }

    public static void main(String[] args) {
        playGame();
    }

}
