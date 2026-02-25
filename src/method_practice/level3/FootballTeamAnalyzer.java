package method_practice.level3;
import java.util.Random;
public class FootballTeamAnalyzer {

        public static int findSum(int[] heights) {
            int sum = 0;
            for (int height : heights)
                sum += height;
            return sum;
        }

        public static double findMean(int[] heights) {
            return (double) findSum(heights) / heights.length;
        }

        public static int findShortest(int[] heights) {
            int min = heights[0];
            for (int height : heights)
                min = Math.min(min, height);
            return min;
        }

        public static int findTallest(int[] heights) {
            int max = heights[0];
            for (int height : heights)
                max = Math.max(max, height);
            return max;
        }

        public static void main(String[] args) {

            int[] heights = new int[11];
            Random random = new Random();

            for (int i = 0; i < heights.length; i++) {
                heights[i] = 150 + random.nextInt(101); // 150–250
            }

            System.out.println("Player Heights:");
            for (int h : heights)
                System.out.print(h + " ");

            System.out.println("\nMean Height: " + findMean(heights));
            System.out.println("Shortest Height: " + findShortest(heights));
            System.out.println("Tallest Height: " + findTallest(heights));
        }
    }

