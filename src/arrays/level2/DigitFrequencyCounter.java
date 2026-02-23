package arrays.level2;
import java.util.*;
public class DigitFrequencyCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        int tempNumber = Math.abs(number);

        int[] frequency = new int[10];

        while (tempNumber != 0) {

            int digit = tempNumber % 10;
            frequency[digit]++;

            tempNumber = tempNumber / 10;
        }

        System.out.println("Digit Frequency:");

        for (int i = 0; i < frequency.length; i++) {

            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
