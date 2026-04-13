package string_Extra.level1;

public class LongestWord {

    public static String find(String sentence) {

        // Split the sentence into words using space as delimiter
        String[] words = sentence.split(" ");

        // Initialize variable to store the longest word
        String longest = "";

        // Iterate through each word in the array
        for (String word : words)

            // Check if current word length is greater than longest found so far
            if (word.length() > longest.length())

                // Update longest word
                longest = word;

        // Return the longest word
        return longest;
    }
}