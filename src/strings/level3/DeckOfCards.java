package strings.level3;
import java.util.Scanner;
public class DeckOfCards {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8",
            "9", "10", "Jack", "Queen", "King", "Ace"};

    public static String[] initializeDeck() {

        int n = suits.length * ranks.length;
        String[] deck = new String[n];

        int index = 0;

        for (int i = 0; i < suits.length; i++)
            for (int j = 0; j < ranks.length; j++)
                deck[index++] = ranks[j] + " of " + suits[i];

        return deck;
    }

    public static void shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int randomCard = i + (int)(Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCard];
            deck[randomCard] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int players, int cardsEach) {

        if (players * cardsEach > deck.length) {
            System.out.println("Not enough cards.");
            return null;
        }

        String[][] result = new String[players][cardsEach];

        int index = 0;

        for (int i = 0; i < players; i++)
            for (int j = 0; j < cardsEach; j++)
                result[i][j] = deck[index++];

        return result;
    }

    public static void display(String[][] players) {

        for (int i = 0; i < players.length; i++) {

            System.out.println("\nPlayer " + (i+1) + " Cards:");

            for (int j = 0; j < players[i].length; j++)
                System.out.println(players[i][j]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = input.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cards = input.nextInt();

        String[][] distributed = distribute(deck, players, cards);

        if (distributed != null)
            display(distributed);
    }
}
