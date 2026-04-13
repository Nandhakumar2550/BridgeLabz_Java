package string_Extra.level1;

public class ToggleCase {

    public static String toggle(String text) {

        // Initialize an empty string to store the result
        String result = "";

        // Loop through each character of the string
        for (int i = 0; i < text.length(); i++) {

            // Get current character
            char ch = text.charAt(i);

            // If character is uppercase, convert to lowercase
            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);

                // If character is lowercase, convert to uppercase
            else if (Character.isLowerCase(ch))
                result += Character.toUpperCase(ch);

                // If it's not a letter (space, digit, symbol), keep as it is
            else
                result += ch;
        }

        // Return the final toggled string
        return result;
    }
}