package arrays.level2;
import java.util.*;
public class NumberReverser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        int tempNumber = number;
        int digitCount = 0;

        // Count digits
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            digitCount++;
        }

        int[] digits = new int[digitCount];

        tempNumber = number;
        int index = 0;

        // Store digits
        while (tempNumber != 0) {
            digits[index] = tempNumber % 10;
            tempNumber = tempNumber / 10;
            index++;
        }

        System.out.println("Reversed number:");

        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}
