package strings.level3;

public class PalindromeCheck {
    public static boolean checkIterative(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }

        return true;
    }

    public static boolean checkRecursive(String text, int start, int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return checkRecursive(text, start + 1, end - 1);
    }

    public static boolean checkUsingArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];

        for (int i = 0; i < original.length; i++)
            reverse[i] = original[original.length - 1 - i];

        for (int i = 0; i < original.length; i++)
            if (original[i] != reverse[i])
                return false;

        return true;
    }

}
