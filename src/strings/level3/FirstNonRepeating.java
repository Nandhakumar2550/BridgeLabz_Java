package strings.level3;

public class FirstNonRepeating {

    public static char findFirstNonRepeating(String text) {

        // Frequency array to store count of each ASCII character
        int[] freq = new int[256];

        // First pass: count frequency of each character
        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        // Second pass: find first character with frequency 1
        for (int i = 0; i < text.length(); i++)

            // If character appears only once, return it
            if (freq[text.charAt(i)] == 1)
                return text.charAt(i);

        // If no non-repeating character found, return null character
        return '\0';
    }
}