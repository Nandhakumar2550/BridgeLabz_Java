package programming_elements.level2;
import java.util.*;
public class TravelComputationInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        String fromCity;
        String viaCity;
        String toCity;

        double distanceFromToVia;
        double distanceViaToFinalCity;

        int timeFromToVia;
        int timeViaToFinalCity;

        System.out.print("Enter traveller name: ");
        name = input.nextLine();

        System.out.print("Enter from city: ");
        fromCity = input.nextLine();

        System.out.print("Enter via city: ");
        viaCity = input.nextLine();

        System.out.print("Enter destination city: ");
        toCity = input.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in km: ");
        distanceFromToVia = input.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in km: ");
        distanceViaToFinalCity = input.nextDouble();

        System.out.print("Enter time from " + fromCity + " to " + viaCity + " in minutes: ");
        timeFromToVia = input.nextInt();

        System.out.print("Enter time from " + viaCity + " to " + toCity + " in minutes: ");
        timeViaToFinalCity = input.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance +
                " km and the Total Time taken is " + totalTime + " minutes");
    }
}
