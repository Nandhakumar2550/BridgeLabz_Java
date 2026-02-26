package strings.level2;

public class ShortestLongestFinder {
    public static int[] findShortestLongest(String[][] data) {

        int shortest = Integer.MAX_VALUE;
        int longest = Integer.MIN_VALUE;

        for (int i = 0; i < data.length; i++) {

            int len = Integer.parseInt(data[i][1]);

            if (len < shortest)
                shortest = len;

            if (len > longest)
                longest = len;
        }

        return new int[]{shortest, longest};
    }
}
