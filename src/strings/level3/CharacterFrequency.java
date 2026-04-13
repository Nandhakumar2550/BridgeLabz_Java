package strings.level3;

public class CharacterFrequency {

    public static String[][] getFrequency(String text) {

        // Frequency array for ASCII characters (0–255)
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        // Count how many unique characters are present
        int count = 0;

        for (int i = 0; i < 256; i++)
            if (freq[i] > 0)
                count++;

        // Create result array: [character, frequency]
        String[][] result = new String[count][2];

        // Index for filling result array
        int index = 0;

        // Store character-frequency pairs
        for (int i = 0; i < 256; i++)
            if (freq[i] > 0) {

                // Convert ASCII value to character
                result[index][0] = String.valueOf((char)i);

                // Store frequency as string
                result[index][1] = String.valueOf(freq[i]);

                index++;
            }

        // Return final frequency table
        return result;
    }
}