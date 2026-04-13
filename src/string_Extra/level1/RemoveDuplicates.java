package string_Extra.level1;

public class RemoveDuplicates {

    public static String remove(String text) {

        // Initialize empty string to store result without duplicates
        String result = "";

        // Loop through each character in the input string
        for (int i = 0; i < text.length(); i++) {

            // Get current character
            char ch = text.charAt(i);

            // Check if character is NOT already present in result
            if (result.indexOf(ch) == -1)

                // Append character only if it's not a duplicate
                result += ch;
        }

        // Return string with duplicates removed
        return result;
    }
}