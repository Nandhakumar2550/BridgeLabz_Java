package string_Extra.level1;

public class ReverseString {

    public static String reverse(String text) {

        // Initialize an empty string to store reversed result
        String reversed = "";

        // Loop from last character to first character
        for (int i = text.length() - 1; i >= 0; i--)

            // Append each character to reversed string
            reversed += text.charAt(i);

        // Return the reversed string
        return reversed;
    }
}