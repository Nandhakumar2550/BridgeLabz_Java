package method_practice.level1;
import java.util.*;
public class TrigonometricCalculator {
    public static double[] calculateTrigonometricFunctions(double angle){
        double radian=Math.toRadians(angle);
        double sine=Math.sin(radian);
        double cosine=Math.cos(radian);
        double tangent=Math.tan(radian);

        return new double[]{sine,cosine,tangent};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine = " + results[0]);
        System.out.println("Cosine = " + results[1]);
        System.out.println("Tangent = " + results[2]);
    }
}
