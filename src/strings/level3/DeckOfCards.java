package strings.level3;

import java.util.Scanner;

public class DeckOfCards {

    // Array of card suits
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

    // Array of card ranks
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8",
            "9", "10", "Jack", "Queen", "King", "Ace"};

    public static String[] initializeDeck() {

        // Total number of cards in deck (4 suits × 13 ranks)
        int n = suits.length * ranks.length;

        // Array to store full deck
        String[] deck = new String[n];

        // Index to fill deck array
        int index = 0;

        // Create deck by combining ranks and suits
        for (int i = 0; i < suits.length; i++)
            for (int j = 0; j < ranks.length; j++)

                // Example: "Ace of Spades"
                deck[index++] = ranks[j] + " of " + suits[i];

        return deck;
    }

    public static void shuffleDeck(String[] deck) {

        // Total number of cards
        int n = deck.length;

        // Fisher-Yates shuffle algorithm
        for (int i = 0; i < n; i++) {

            // Pick random index from i to n-1
            int randomCard = i + (int)(Math.random() * (n - i));

            // Swap current card with random card
            String temp = deck[i];
            deck[i] = deck[randomCard];
            deck[randomCard] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int players, int cardsEach) {

        // Check if enough cards are available
        if (players * cardsEach > deck.length) {
            System.out.println("Not enough cards.");
            return null;
        }

        // 2D array: rows = players, columns = cards per player
        String[][] result = new String[players][cardsEach];

        // Index to track deck position
        int index = 0;

        // Distribute cards to players
        for (int i = 0; i < players; i++)
            for (int j = 0; j < cardsEach; j++)
                result[i][j] = deck[index++];

        return result;
    }

    public static void display(String[][] players) {

        // Loop through each player
        for (int i = 0; i < players.length; i++) {

            // Print player number
            System.out.println("\nPlayer " + (i+1) + " Cards:");

            // Print cards of each player
            for (int j = 0; j < players[i].length; j++)
                System.out.println(players[i][j]);
        }
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Create full deck of cards
        String[] deck = initializeDeck();

        // Shuffle the deck randomly
        shuffleDeck(deck);

        // Input number of players
        System.out.print("Enter number of players: ");
        int players = input.nextInt();

        // Input cards per player
        System.out.print("Enter number of cards per player: ");
        int cards = input.nextInt();

        // Distribute cards
        String[][] distributed = distribute(deck, players, cards);

        // Display result if valid
        if (distributed != null)
            display(distributed);
    }
}