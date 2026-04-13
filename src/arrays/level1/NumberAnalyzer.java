import java.util.*;

public class NumberAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        int positive = 0, negative = 0, zero = 0;
        int even = 0, odd = 0;

        int sum = 0;
        int max, min;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            sum += numbers[i];

            // Count positive / negative / zero
            if (numbers[i] > 0) positive++;
            else if (numbers[i] < 0) negative++;
            else zero++;

            // Even / Odd check
            if (numbers[i] != 0) {
                if (numbers[i] % 2 == 0) even++;
                else odd++;
            }
        }

        max = numbers[0];
        min = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        double average = (double) sum / numbers.length;

        // Output
        System.out.println("\n--- Analysis ---");

        System.out.println("Positive count: " + positive);
        System.out.println("Negative count: " + negative);
        System.out.println("Zero count: " + zero);

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        System.out.println("Average: " + average);

        // First vs Last
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last)
            System.out.println("First and Last are Equal");
        else if (first > last)
            System.out.println("First is Greater than Last");
        else
            System.out.println("First is Less than Last");

        input.close();
    }
}