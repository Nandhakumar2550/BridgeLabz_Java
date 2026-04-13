package programming_elements.level1;

public class EarthVolumeCalculator {
    public static void main(String[] args) {

        double radiusKm = 6378;
        // Radius of Earth in kilometers

        double pi = 3.14159;
        // Value of pi used for calculation

        double conversionFactor = 1.6;
        // Conversion factor from kilometers to miles

        double volumeKm = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        // Calculates volume of Earth in cubic kilometers using formula (4/3 * π * r^3)

        double radiusMiles = radiusKm / conversionFactor;
        // Converts radius from kilometers to miles

        double volumeMiles = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);
        // Calculates volume in cubic miles using converted radius

        System.out.println("The volume of earth in cubic kilometers is " +
                volumeKm + " and cubic miles is " + volumeMiles);
        // Displays both volume values
    }
}