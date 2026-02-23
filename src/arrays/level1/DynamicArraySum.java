package arrays.level1;
import java.util.*;
public class DynamicArraySum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            double value = input.nextDouble();

            if (value <= 0 || index == numbers.length) {
                break;
            }

            numbers[index] = value;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Total sum is " + total);
    }
}
