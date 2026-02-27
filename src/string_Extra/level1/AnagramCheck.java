package string_Extra.level1;

public class AnagramCheck {
    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int f : freq)
            if (f != 0)
                return false;

        return true;
    }
}
