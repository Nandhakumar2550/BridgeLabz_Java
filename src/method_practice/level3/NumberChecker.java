package method_practice.level3;
import java.util.Arrays;
public class NumberChecker {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigits(int number) {

        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++)
            digits[i] = numStr.charAt(i) - '0';

        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {

        boolean hasZero = false;

        for (int digit : digits) {
            if (digit == 0)
                hasZero = true;
        }

        return hasZero;
    }

    public static boolean isArmstrong(int number, int[] digits) {

        int power = digits.length;
        int sum = 0;

        for (int digit : digits)
            sum += Math.pow(digit, power);

        return sum == number;
    }

    public static int[] findLargestTwo(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestTwo(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }
}
