package strings.level2;

public class ShortestLongestFinder {

    public static int[] findShortestLongest(String[][] data) {

        // Initialize shortest value with maximum possible integer
        int shortest = Integer.MAX_VALUE;

        // Initialize longest value with minimum possible integer
        int longest = Integer.MIN_VALUE;

        // Loop through each row in the 2D array
        for (int i = 0; i < data.length; i++) {

            // Convert second column value (length) from String to int
            int len = Integer.parseInt(data[i][1]);

            // Update shortest value if current length is smaller
            if (len < shortest)
                shortest = len;

            // Update longest value if current length is larger
            if (len > longest)
                longest = len;
        }

        // Return both shortest and longest values
        return new int[]{shortest, longest};
    }
}