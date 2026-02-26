package strings.level3;
import java.util.Scanner;
public class TeamBMI {
    public static String getBMIStatus(double bmi) {

        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static String[][] calculateBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightMeters = data[i][1] / 100.0;

            double bmi = weight / (heightMeters * heightMeters);
            bmi = Math.round(bmi * 100) / 100.0;

            result[i][0] = String.valueOf(data[i][1]); // height
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = getBMIStatus(bmi);
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println("Height(cm)\tWeight\tBMI\tStatus");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" +
                    data[i][1] + "\t" +
                    data[i][2] + "\t" +
                    data[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[][] persons = new double[10][2];

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            persons[i][0] = input.nextDouble();

            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            persons[i][1] = input.nextDouble();
        }

        String[][] result = calculateBMI(persons);
        display(result);
    }
}
