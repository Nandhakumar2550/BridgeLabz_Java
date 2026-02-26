package strings.level3;

public class FirstNonRepeating {
    public static char findFirstNonRepeating(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        for (int i = 0; i < text.length(); i++)
            if (freq[text.charAt(i)] == 1)
                return text.charAt(i);

        return '\0';
    }
}
