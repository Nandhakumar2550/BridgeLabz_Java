package programming_elements.level1;
import java.util.Scanner;
public class KmToMilesInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km;
        double conversionFactor = 1.6;

        System.out.print("Enter distance in km: ");
        km = input.nextDouble();

        double miles = km / conversionFactor;

        System.out.println("The total miles is " + miles +
                " mile for the given " + km + " km");
    }

}
