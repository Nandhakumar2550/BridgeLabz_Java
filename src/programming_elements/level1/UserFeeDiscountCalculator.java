package programming_elements.level1;
import java.util.*;
public class UserFeeDiscountCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fee;
        double discountPercent;

        System.out.print("Enter the Course Fee: ");
        fee = input.nextDouble();

        System.out.print("Enter the Discount Percentage: ");
        discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}
