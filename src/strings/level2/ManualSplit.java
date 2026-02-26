package strings.level2;
import java.util.Scanner;
public class ManualSplit {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitText(String text) {

        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++)
            if (text.charAt(i) == ' ')
                wordCount++;

        String[] words = new String[wordCount];

        int start = 0, index = 0;

        for (int i = 0; i <= length; i++) {

            if (i == length || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i]))
                return false;

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = input.nextLine();

        String[] manual = splitText(text);
        String[] builtIn = text.split(" ");

        System.out.println("Same? " + compareArrays(manual, builtIn));
    }
}
