package string_Extra.level1;

public class SubstringCount {
    public static int countOccurrences(String text, String sub) {

        int count = 0;

        for (int i = 0; i <= text.length() - sub.length(); i++) {

            if (text.substring(i, i + sub.length()).equals(sub))
                count++;
        }

        return count;
    }
}
