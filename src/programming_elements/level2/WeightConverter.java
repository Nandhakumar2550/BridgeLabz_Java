package programming_elements.level2;
import java.util.*;
public class WeightConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weightInPounds;
        double conversionFactor = 2.2;

        System.out.print("Enter weight in pounds: ");
        weightInPounds = input.nextDouble();

        double weightInKg = weightInPounds / conversionFactor;

        System.out.println("The weight of the person in pound is "
                + weightInPounds +
                " and in kg is " + weightInKg);
    }
}
