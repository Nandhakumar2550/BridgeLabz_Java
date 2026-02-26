package strings.level3;
import java.util.Scanner;
public class UniqueCharacters {
    public static char[] findUnique(String text) {

        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            boolean isUnique = true;

            for (int j = 0; j < i; j++)
                if (text.charAt(i) == text.charAt(j))
                    isUnique = false;

            if (isUnique)
                temp[index++] = text.charAt(i);
        }

        char[] result = new char[index];

        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        char[] unique = findUnique(text);

        System.out.println("Unique Characters:");
        for (char c : unique)
            System.out.print(c + " ");
    }
}
