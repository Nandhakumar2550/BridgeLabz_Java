package programming_elements.level1;
import java.util.*;
public class HeightConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double heightInCm;

        System.out.print("Enter height in centimeters: ");
        heightInCm = input.nextDouble();

        double totalInches = heightInCm / 2.54;
        int feet = (int) (totalInches / 12);
        double remainingInches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightInCm +
                " while in feet is " + feet +
                " and inches is " + remainingInches);
    }
}
