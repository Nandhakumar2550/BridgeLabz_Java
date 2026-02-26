package strings.level1;
import java.util.Scanner;
public class ArrayIndexDemo {
    public static void generate(String[] names) {
        System.out.println(names[names.length]); // invalid index
    }

    public static void handle(String[] names) {

        try {
            System.out.println(names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
        catch (RuntimeException e) {
            System.out.println("Handled Generic RuntimeException");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[3];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name: ");
            names[i] = input.next();
        }

        // generate(names); // Uncomment to crash
        handle(names);
    }
}
