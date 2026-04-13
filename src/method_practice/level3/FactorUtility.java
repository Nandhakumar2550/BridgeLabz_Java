package method_practice.level3;

public class FactorUtility {

    public static int[] getFactors(int number) {

        int count = 0;
        // Counts number of factors

        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                count++;
        // Finds total number of factors

        int[] factors = new int[count];
        // Creates array to store factors

        int index = 0;
        // Index for array

        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                factors[index++] = i;
        // Stores all factors

        return factors;
        // Returns factor array
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 2];
        // Returns second last factor (largest proper factor)
    }

    public static int sumFactors(int[] factors) {

        int sum = 0;
        // Initializes sum

        for (int f : factors)
            sum += f;
        // Adds all factors

        return sum;
        // Returns sum
    }

    public static long productFactors(int[] factors) {

        long product = 1;
        // Initializes product

        for (int f : factors)
            product *= f;
        // Multiplies all factors

        return product;
        // Returns product
    }

    public static double productCubeFactors(int[] factors) {

        double product = 1;
        // Initializes product

        for (int f : factors)
            product *= Math.pow(f, 3);
        // Multiplies cube of each factor

        return product;
        // Returns result
    }

    public static boolean isPerfect(int number) {

        int[] factors = getFactors(number);
        // Gets all factors

        int sum = 0;
        // Initializes sum

        for (int i = 0; i < factors.length - 1; i++)
            sum += factors[i];
        // Sums proper factors (excluding number itself)

        return sum == number;
        // Checks perfect number condition
    }

    public static boolean isAbundant(int number) {

        int[] factors = getFactors(number);
        // Gets all factors

        int sum = 0;

        for (int i = 0; i < factors.length - 1; i++)
            sum += factors[i];
        // Sums proper factors

        return sum > number;
        // Checks abundant condition
    }

    public static boolean isDeficient(int number) {

        int[] factors = getFactors(number);
        // Gets all factors

        int sum = 0;

        for (int i = 0; i < factors.length - 1; i++)
            sum += factors[i];
        // Sums proper factors

        return sum < number;
        // Checks deficient condition
    }

    public static boolean isStrong(int number) {

        int temp = number;
        // Stores original number

        int sum = 0;
        // Initializes sum of factorials

        while (temp != 0) {

            int digit = temp % 10;
            // Extracts last digit

            sum += factorial(digit);
            // Adds factorial of digit

            temp /= 10;
            // Removes last digit
        }

        return sum == number;
        // Checks strong number condition
    }

    private static int factorial(int n) {

        int fact = 1;
        // Initializes factorial

        for (int i = 1; i <= n; i++)
            fact *= i;
        // Calculates factorial

        return fact;
        // Returns factorial
    }
}