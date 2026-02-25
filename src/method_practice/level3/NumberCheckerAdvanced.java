package method_practice.level3;

public class NumberCheckerAdvanced {
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits)
            sum += digit;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits)
            sum += Math.pow(digit, 2);
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumDigits(digits);
        return number % sum == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        for (int digit : digits)
            frequency[digit][1]++;

        return frequency;
    }
}
