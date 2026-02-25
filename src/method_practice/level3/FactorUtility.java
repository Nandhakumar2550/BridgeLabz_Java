package method_practice.level3;

public class FactorUtility {
    public static int[] getFactors(int number) {

        int count = 0;

        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                count++;

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                factors[index++] = i;

        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 2]; // second last
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors)
            sum += f;
        return sum;
    }

    public static long productFactors(int[] factors) {
        long product = 1;
        for (int f : factors)
            product *= f;
        return product;
    }

    public static double productCubeFactors(int[] factors) {
        double product = 1;
        for (int f : factors)
            product *= Math.pow(f, 3);
        return product;
    }

    public static boolean isPerfect(int number) {

        int[] factors = getFactors(number);
        int sum = 0;

        for (int i = 0; i < factors.length - 1; i++)
            sum += factors[i];

        return sum == number;
    }

    public static boolean isAbundant(int number) {

        int[] factors = getFactors(number);
        int sum = 0;

        for (int i = 0; i < factors.length - 1; i++)
            sum += factors[i];

        return sum > number;
    }

    public static boolean isDeficient(int number) {

        int[] factors = getFactors(number);
        int sum = 0;

        for (int i = 0; i < factors.length - 1; i++)
            sum += factors[i];

        return sum < number;
    }

    public static boolean isStrong(int number) {

        int temp = number;
        int sum = 0;

        while (temp != 0) {

            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    private static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }
}
