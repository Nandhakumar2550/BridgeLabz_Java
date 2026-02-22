package programming_elements.level1;
import java.util.*;
public class DistanceConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distanceInFeet;

        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in feet is " + distanceInFeet +
                ", in yards is " + yards +
                " and in miles is " + miles);
    }
}
