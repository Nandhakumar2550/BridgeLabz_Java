package string_Extra.level1;

public class LexicographicalCompare {
    public static int compare(String s1, String s2) {

        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {

            if (s1.charAt(i) != s2.charAt(i))
                return s1.charAt(i) - s2.charAt(i);
        }

        return s1.length() - s2.length();
    }
}
