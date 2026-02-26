package strings.level3;
import java.util.Scanner;
public class AnagramChecker {
    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++)
            if (freq[i] != 0)
                return false;

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = input.nextLine();

        System.out.print("Enter second text: ");
        String text2 = input.nextLine();

        if (isAnagram(text1, text2))
            System.out.println("The texts are Anagrams.");
        else
            System.out.println("The texts are NOT Anagrams.");
    }
}
