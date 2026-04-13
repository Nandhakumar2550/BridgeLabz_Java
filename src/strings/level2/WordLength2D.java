package strings.level2;

public class WordLength2D {

    public static int findLength(String text) {

        // Counter to calculate string length manually
        int count = 0;

        try {

            // Loop until exception occurs
            while (true) {

                // Access each character one by one
                text.charAt(count);

                // Increment counter for valid characters
                count++;
            }

        } catch (Exception e) {

            // Return final calculated length
            return count;
        }
    }

    public static String[][] wordWithLength(String[] words) {

        // 2D array: column 0 = word, column 1 = word length
        String[][] result = new String[words.length][2];

        // Loop through all words
        for (int i = 0; i < words.length; i++) {

            // Store word in first column
            result[i][0] = words[i];

            // Store length of word as string in second column
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }
}