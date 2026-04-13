package programming_elements.level2;
import java.util.* ;

public class ChocolateDistribution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        int numberOfChocolates;
        int numberOfChildren;
        // Declares variables to store chocolates and children count

        System.out.print("Enter number of chocolates: ");
        // Prompts user to enter total chocolates

        numberOfChocolates = input.nextInt();
        // Reads number of chocolates

        System.out.print("Enter number of children: ");
        // Prompts user to enter number of children

        numberOfChildren = input.nextInt();
        // Reads number of children

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        // Calculates chocolates each child gets

        int remainingChocolates = numberOfChocolates % numberOfChildren;
        // Calculates remaining chocolates

        System.out.println("The number of chocolates each child gets is "
                + chocolatesPerChild +
                " and the number of remaining chocolates are "
                + remainingChocolates);
        // Displays the result
    }
}