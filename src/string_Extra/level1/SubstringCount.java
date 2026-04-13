package string_Extra.level1;

public class SubstringCount {

    public static int countOccurrences(String text, String sub) {

        // Initialize counter to store number of occurrences
        int count = 0;

        // Loop through the string until remaining length is enough for substring
        for (int i = 0; i <= text.length() - sub.length(); i++) {

            // Extract substring of same length as 'sub' and compare
            if (text.substring(i, i + sub.length()).equals(sub))

                // If match found, increase count
                count++;
        }

        // Return total occurrences found
        return count;
    }
}