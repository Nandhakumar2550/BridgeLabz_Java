package strings.level1;

import java.util.Scanner;

public class ArrayIndexDemo {

    public static void generate(String[] names) {

        // This line tries to access invalid index (names.length is out of bounds)
        System.out.println(names[names.length]); // invalid index
    }

    public static void handle(String[] names) {

        try {

            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(names[names.length]);

        }
        // Specific exception handler for array index errors
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
        // Generic runtime exception handler (fallback)
        catch (RuntimeException e) {

            System.out.println("Handled Generic RuntimeException");
        }
    }

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Create array of size 3
        String[] names = new String[3];

        // Input loop to fill array
        for (int i = 0; i < names.length; i++) {

            System.out.print("Enter name: ");
            names[i] = input.next();
        }

        // Uncommenting this will crash program due to invalid index
        // generate(names);

        // Safe method with exception handling
        handle(names);
    }
}