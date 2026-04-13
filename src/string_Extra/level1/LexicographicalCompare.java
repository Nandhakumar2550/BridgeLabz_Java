package string_Extra.level1;

public class LexicographicalCompare {

    public static int compare(String s1, String s2) {

        // Find the minimum length of both strings
        int minLength = Math.min(s1.length(), s2.length());

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {

            // If characters differ, return their ASCII difference
            if (s1.charAt(i) != s2.charAt(i))
                return s1.charAt(i) - s2.charAt(i);
        }

        // If all characters are same till minLength,
        // shorter string is considered smaller
        return s1.length() - s2.length();
    }
}