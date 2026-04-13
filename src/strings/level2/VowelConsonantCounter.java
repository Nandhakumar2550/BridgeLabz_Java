package strings.level2;

public class VowelConsonantCounter {

    public static String checkCharType(char ch) {

        // Convert uppercase letter to lowercase for uniform comparison
        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        // Check if character is a lowercase alphabet
        if (ch >= 'a' && ch <= 'z') {

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                // If not vowel, it is a consonant
                return "Consonant";
        }

        // If not a letter (digit, space, symbol)
        return "Not Letter";
    }

    public static int[] countVowelsConsonants(String text) {

        // Counter for vowels
        int vowels = 0;

        // Counter for consonants
        int consonants = 0;

        // Loop through each character in string
        for (int i = 0; i < text.length(); i++) {

            // Get type of current character
            String type = checkCharType(text.charAt(i));

            // Increment vowel count
            if (type.equals("Vowel"))
                vowels++;

                // Increment consonant count
            else if (type.equals("Consonant"))
                consonants++;
        }

        // Return result array [vowels, consonants]
        return new int[]{vowels, consonants};
    }
}