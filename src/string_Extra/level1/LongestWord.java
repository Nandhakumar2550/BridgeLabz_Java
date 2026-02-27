package string_Extra.level1;

public class LongestWord {
    public static String find(String sentence) {

        String[] words = sentence.split(" ");

        String longest = "";

        for (String word : words)
            if (word.length() > longest.length())
                longest = word;

        return longest;
    }
}
