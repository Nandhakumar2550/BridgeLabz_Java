package method_practice.level3;
import java.util.Random;

public class FootballTeamAnalyzer {

    public static int findSum(int[] heights) {

        int sum = 0;
        // Initializes sum

        for (int height : heights)
            sum += height;
        // Adds all heights

        return sum;
        // Returns total height
    }

    public static double findMean(int[] heights) {

        return (double) findSum(heights) / heights.length;
        // Calculates average height
    }

    public static int findShortest(int[] heights) {

        int min = heights[0];
        // Assumes first value as minimum

        for (int height : heights)
            min = Math.min(min, height);
        // Finds smallest height

        return min;
        // Returns shortest height
    }

    public static int findTallest(int[] heights) {

        int max = heights[0];
        // Assumes first value as maximum

        for (int height : heights)
            max = Math.max(max, height);
        // Finds largest height

        return max;
        // Returns tallest height
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        // Array to store heights of 11 players

        Random random = new Random();
        // Creates Random object

        for (int i = 0; i < heights.length; i++) {

            heights[i] = 150 + random.nextInt(101);
            // Generates random height between 150 and 250
        }

        System.out.println("Player Heights:");
        // Prints heading

        for (int h : heights)
            System.out.print(h + " ");
        // Displays all heights

        System.out.println("\nMean Height: " + findMean(heights));
        // Displays average height

        System.out.println("Shortest Height: " + findShortest(heights));
        // Displays minimum height

        System.out.println("Tallest Height: " + findTallest(heights));
        // Displays maximum height
    }
}