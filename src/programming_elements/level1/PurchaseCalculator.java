package programming_elements.level1;
import java.util.*;

public class PurchaseCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double unitPrice;
        int quantity;
        // Declares variables for unit price and quantity

        System.out.print("Enter unit price: ");
        // Prompts user to enter unit price

        unitPrice = input.nextDouble();
        // Reads unit price from user

        System.out.print("Enter quantity: ");
        // Prompts user to enter quantity

        quantity = input.nextInt();
        // Reads quantity from user

        double totalPrice = unitPrice * quantity;
        // Calculates total purchase price

        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);
        // Displays the total price along with input details
    }
}