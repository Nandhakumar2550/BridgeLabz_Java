package method_practice.level3;

public class NumberCheckerExtra {

    public static boolean isPrime(int number) {

        if (number <= 1)
            return false;
        // Numbers ≤ 1 are not prime

        for (int i = 2; i <= Math.sqrt(number); i++) {
            // Loops from 2 to √number

            if (number % i == 0)
                return false;
            // If divisible → not prime
        }

        return true;
        // Number is prime
    }

    public static boolean isNeon(int number) {

        int square = number * number;
        // Calculates square of number

        int sum = 0;
        // Initializes sum

        while (square != 0) {

            sum += square % 10;
            // Extracts last digit and adds

            square /= 10;
            // Removes last digit
        }

        return sum == number;
        // Checks Neon number condition
    }

    public static boolean isSpy(int number) {

        int sum = 0;
        // Sum of digits

        int product = 1;
        // Product of digits

        int temp = number;
        // Temporary variable

        while (temp != 0) {

            int digit = temp % 10;
            // Extracts last digit

            sum += digit;
            // Adds digit

            product *= digit;
            // Multiplies digit

            temp /= 10;
            // Removes last digit
        }

        return sum == product;
        // Checks Spy number condition
    }

    public static boolean isAutomorphic(int number) {

        int square = number * number;
        // Calculates square

        return String.valueOf(square).endsWith(String.valueOf(number));
        // Checks if square ends with original number
    }

    public static boolean isBuzz(int number) {

        return number % 7 == 0 || number % 10 == 7;
        // Checks if divisible by 7 OR ends with 7
    }
}