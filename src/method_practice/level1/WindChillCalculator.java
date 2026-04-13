package method_practice.level1;
import java.util.*;

public class WindChillCalculator {

    public static double calculateWindChill(double temperature, double windSpeed){

        double windChill = 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        // Calculates wind chill using standard formula

        return windChill;
        // Returns calculated wind chill
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.print("Enter temperature: ");
        // Prompts user to enter temperature

        double temperature = input.nextDouble();
        // Reads temperature

        System.out.print("Enter wind speed: ");
        // Prompts user to enter wind speed

        double windSpeed = input.nextDouble();
        // Reads wind speed

        double windChill = calculateWindChill(temperature, windSpeed);
        // Calls method to calculate wind chill

        System.out.println("Wind Chill Temperature = " + windChill);
        // Displays result

        input.close();
        // Closes Scanner
    }
}