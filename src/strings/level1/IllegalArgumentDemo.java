package strings.level1;
import java.util.Scanner;
public class IllegalArgumentDemo {
    public static void generate(String text) {
        System.out.println(text.substring(5, 2)); // start > end
    }

    public static void handle(String text) {

        try {
            System.out.println(text.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        }
        catch (RuntimeException e) {
            System.out.println("Handled Generic RuntimeException");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.next();

        // generate(text); // Uncomment to crash
        handle(text);
    }
}
