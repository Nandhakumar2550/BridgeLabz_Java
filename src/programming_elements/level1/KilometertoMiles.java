package programming_elements.level1;

public class KilometertoMiles {
    public static void main(String args[]){

        double distanceinkm = 10.8;
        // Distance value in kilometers

        double conversionfactor = 1.6;
        // Conversion factor (1 mile = 1.6 km)

        double distancetomiles = distanceinkm / conversionfactor;
        // Converts kilometers to miles

        System.out.print("The distance " + distanceinkm +
                " km in miles is " + distancetomiles);
        // Displays the converted distance
    }
}