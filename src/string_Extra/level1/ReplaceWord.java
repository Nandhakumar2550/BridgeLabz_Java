package string_Extra.level1;

public class ReplaceWord {

    public static String replace(String sentence, String oldWord, String newWord) {

        // Split the sentence into words using space as delimiter
        String[] words = sentence.split(" ");

        // Initialize result string to build final output
        String result = "";

        // Loop through each word in the sentence
        for (int i = 0; i < words.length; i++) {

            // If current word matches the word to replace
            if (words[i].equals(oldWord))

                // Replace it with new word
                result += newWord;

            else

                // Otherwise keep original word
                result += words[i];

            // Add space between words except after last word
            if (i != words.length - 1)
                result += " ";
        }

        // Return the final modified sentence
        return result;
    }
}