package strings.level1;
import java.util.Scanner;
public class StringCompare {
    public static boolean compareUsingCharAt(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.next();

        System.out.print("Enter second string: ");
        String str2 = input.next();

        boolean manualResult = compareUsingCharAt(str1, str2);
        boolean builtInResult = str1.equals(str2);

        System.out.println("Manual Compare: " + manualResult);
        System.out.println("Built-in equals(): " + builtInResult);
        System.out.println("Results Same? " + (manualResult == builtInResult));
    }
}
