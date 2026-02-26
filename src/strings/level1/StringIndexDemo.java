package strings.level1;
import java.util.Scanner;
public class StringIndexDemo {
    public static void generate(String text) {
        System.out.println(text.charAt(text.length())); // Invalid index
    }

    public static void handle(String text) {

        try {
            System.out.println(text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.next();
        handle(text);
    }
}
