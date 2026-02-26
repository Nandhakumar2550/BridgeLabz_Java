package strings.level1;
import java.util.Scanner;
public class NumberFormatDemo {
    public static void generate(String text) {
        int number = Integer.parseInt(text);
        System.out.println(number);
    }

    public static void handle(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        }
        catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
        catch (RuntimeException e) {
            System.out.println("Handled Generic RuntimeException");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number in text form: ");
        String text = input.next();

        // generate(text); // Uncomment to crash
        handle(text);
    }
}
