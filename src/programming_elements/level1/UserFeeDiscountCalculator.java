package programming_elements.level1;
import java.util.*;

public class UserFeeDiscountCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double fee;
        // Declares variable to store course fee

        double discountPercent;
        // Declares variable to store discount percentage

        System.out.print("Enter the Course Fee: ");
        // Prompts user to enter course fee

        fee = input.nextDouble();
        // Reads fee from user

        System.out.print("Enter the Discount Percentage: ");
        // Prompts user to enter discount percentage

        discountPercent = input.nextDouble();
        // Reads discount percentage from user

        double discount = (discountPercent / 100) * fee;
        // Calculates discount amount

        double finalFee = fee - discount;
        // Calculates final fee after discount

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
        // Displays discount and final fee
    }
}