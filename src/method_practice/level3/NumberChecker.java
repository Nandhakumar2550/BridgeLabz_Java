package method_practice.level3;
import java.util.Arrays;

public class NumberChecker {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
        // Converts number to string and returns its length (digit count)
    }

    public static int[] getDigits(int number) {

        String numStr = String.valueOf(Math.abs(number));
        // Converts number to string

        int[] digits = new int[numStr.length()];
        // Creates array to store digits

        for (int i = 0; i < numStr.length(); i++)
            digits[i] = numStr.charAt(i) - '0';
        // Converts each character to integer digit

        return digits;
        // Returns digit array
    }

    public static boolean isDuckNumber(int[] digits) {

        boolean hasZero = false;
        // Flag to check presence of zero

        for (int digit : digits) {
            if (digit == 0)
                hasZero = true;
        }
        // Checks if any digit is zero

        return hasZero;
        // Returns true if zero exists
    }

    public static boolean isArmstrong(int number, int[] digits) {

        int power = digits.length;
        // Number of digits (power)

        int sum = 0;
        // Initializes sum

        for (int digit : digits)
            sum += Math.pow(digit, power);
        // Adds each digit raised to power

        return sum == number;
        // Checks Armstrong condition
    }

    public static int[] findLargestTwo(int[] digits) {

        int largest = Integer.MIN_VALUE;
        // Initializes largest

        int secondLargest = Integer.MIN_VALUE;
        // Initializes second largest

        for (int digit : digits) {

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            }
            // Updates largest and second largest

            else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
            // Updates second largest if distinct
        }

        return new int[]{largest, secondLargest};
        // Returns largest two digits
    }

    public static int[] findSmallestTwo(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        // Initializes smallest

        int secondSmallest = Integer.MAX_VALUE;
        // Initializes second smallest

        for (int digit : digits) {

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            }
            // Updates smallest and second smallest

            else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
            // Updates second smallest if distinct
        }

        return new int[]{smallest, secondSmallest};
        // Returns smallest two digits
    }
}