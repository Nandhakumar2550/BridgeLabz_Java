package string_Extra.level1;

public class RemoveCharacter {

    public static String remove(String text, char removeChar) {

        // Initialize an empty string to store result
        String result = "";

        // Loop through each character of the input string
        for (int i = 0; i < text.length(); i++)

            // Check if current character is NOT the one to remove
            if (text.charAt(i) != removeChar)

                // Append character to result
                result += text.charAt(i);

        // Return the final string after removal
        return result;
    }
}