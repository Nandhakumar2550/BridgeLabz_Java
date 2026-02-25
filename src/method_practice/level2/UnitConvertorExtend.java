package method_practice.level2;
import java.util.*;
public class UnitConvertorExtend {
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the yards");
        double yards=scan.nextDouble();
        System.out.println("Enter the feet");
        double feet=scan.nextDouble();
        System.out.println("Enter the meters");
        double meters=scan.nextDouble();
        System.out.println("Enter the inches");
        double inches=scan.nextDouble();
        System.out.println("convertYardsToFeet " + convertYardsToFeet(yards));
        System.out.println("convertFeetToYards " + convertFeetToYards(feet) );
        System.out.println("convertMetersToInches " + convertMetersToInches(meters));
        System.out.println("convertInchesToCm " + convertInchesToCm(inches));
    }
}
