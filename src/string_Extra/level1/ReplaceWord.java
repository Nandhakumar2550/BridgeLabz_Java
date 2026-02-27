package string_Extra.level1;

public class ReplaceWord {
    public static String replace(String sentence, String oldWord, String newWord) {

        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(oldWord))
                result += newWord;
            else
                result += words[i];

            if (i != words.length - 1)
                result += " ";
        }

        return result;
    }
}
