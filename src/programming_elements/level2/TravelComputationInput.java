package programming_elements.level2;
import java.util.*;

public class TravelComputationInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        String name;
        String fromCity;
        String viaCity;
        String toCity;
        // Declares variables to store traveller and city details

        double distanceFromToVia;
        double distanceViaToFinalCity;
        // Declares variables to store distances

        int timeFromToVia;
        int timeViaToFinalCity;
        // Declares variables to store travel time

        System.out.print("Enter traveller name: ");
        // Prompts user to enter name

        name = input.nextLine();
        // Reads traveller name

        System.out.print("Enter from city: ");
        // Prompts user to enter starting city

        fromCity = input.nextLine();
        // Reads starting city

        System.out.print("Enter via city: ");
        // Prompts user to enter intermediate city

        viaCity = input.nextLine();
        // Reads intermediate city

        System.out.print("Enter destination city: ");
        // Prompts user to enter destination city

        toCity = input.nextLine();
        // Reads destination city

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in km: ");
        // Prompts for distance from starting city to via city

        distanceFromToVia = input.nextDouble();
        // Reads distance value

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in km: ");
        // Prompts for distance from via city to destination

        distanceViaToFinalCity = input.nextDouble();
        // Reads distance value

        System.out.print("Enter time from " + fromCity + " to " + viaCity + " in minutes: ");
        // Prompts for time from starting city to via city

        timeFromToVia = input.nextInt();
        // Reads time value

        System.out.print("Enter time from " + viaCity + " to " + toCity + " in minutes: ");
        // Prompts for time from via city to destination

        timeViaToFinalCity = input.nextInt();
        // Reads time value

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        // Calculates total distance travelled

        int totalTime = timeFromToVia + timeViaToFinalCity;
        // Calculates total time taken

        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance +
                " km and the Total Time taken is " + totalTime + " minutes");
        // Displays total distance and time
    }
}