package strings.level2;

import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {

        // Generate random number between 0 and 2
        int choice = (int)(Math.random() * 3);

        // Map number to rock
        if (choice == 0) return "rock";

        // Map number to paper
        if (choice == 1) return "paper";

        // Otherwise return scissors
        return "scissors";
    }

    public static String findWinner(String user, String computer) {

        // If both choices are same → draw
        if (user.equals(computer))
            return "Draw";

        // Check all winning conditions for user
        if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper")))

            return "User";

        // If not user win or draw → computer wins
        return "Computer";
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Ask number of games
        System.out.print("Enter number of games: ");
        int games = input.nextInt();

        // Track wins
        int userWins = 0, compWins = 0;

        // Print table header
        System.out.println("Game\tUser\tComputer\tWinner");

        // Loop for each game
        for (int i = 1; i <= games; i++) {

            // Get user choice
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = input.next();

            // Get computer random choice
            String computer = getComputerChoice();

            // Determine winner
            String winner = findWinner(user, computer);

            // Update win counters
            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) compWins++;

            // Print game result
            System.out.println(i + "\t" + user + "\t" + computer + "\t\t" + winner);
        }

        // Calculate win percentages
        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;

        // Print final results
        System.out.println("\nUser Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("User Win %: " + userPercent);
        System.out.println("Computer Win %: " + compPercent);
    }
}