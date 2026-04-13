package method_practice.level3;

public class NumberCheckerAdvanced {

    public static int sumDigits(int[] digits) {

        int sum = 0;
        // Initializes sum

        for (int digit : digits)
            sum += digit;
        // Adds all digits

        return sum;
        // Returns sum of digits
    }

    public static int sumOfSquares(int[] digits) {

        int sum = 0;
        // Initializes sum

        for (int digit : digits)
            sum += Math.pow(digit, 2);
        // Adds square of each digit

        return sum;
        // Returns result
    }

    public static boolean isHarshad(int number, int[] digits) {

        int sum = sumDigits(digits);
        // Gets sum of digits

        return number % sum == 0;
        // Checks if divisible by sum (Harshad condition)
    }

    public static int[][] findDigitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];
        // Creates 2D array: [digit][count]

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            // Stores digit value

            frequency[i][1] = 0;
            // Initializes count to 0
        }

        for (int digit : digits)
            frequency[digit][1]++;
        // Increments frequency of each digit

        return frequency;
        // Returns frequency array
    }
}