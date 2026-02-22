package programming_elements.level2;
import java.util.*;
public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fahrenheit;

        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit +
                " fahrenheit is " + celsiusResult +
                " celsius");
    }
}
