package strings.level1;
import java.util.Scanner;
public class SubstringCreator {
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++)
            result += text.charAt(i);

        return result;
    }

    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i))
                return false;

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.next();

        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        String manual = createSubstring(text, start, end);
        String builtIn = text.substring(start, end);

        System.out.println("Manual Substring: " + manual);
        System.out.println("Built-in Substring: " + builtIn);
        System.out.println("Same? " + compareStrings(manual, builtIn));
    }
}
