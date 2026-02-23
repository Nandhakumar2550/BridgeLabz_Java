package arrays.level2;
import java.util.*;
public class StudentGradeSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfStudents;

        System.out.print("Enter number of students: ");
        numberOfStudents = input.nextInt();

        double[] physics = new double[numberOfStudents];
        double[] chemistry = new double[numberOfStudents];
        double[] maths = new double[numberOfStudents];
        double[] percentage = new double[numberOfStudents];
        String[] grade = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {

            System.out.print("Enter Physics marks: ");
            physics[i] = input.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = input.nextDouble();

            System.out.print("Enter Maths marks: ");
            maths[i] = input.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Enter again.");
                i--;
            }
        }

        for (int i = 0; i < numberOfStudents; i++) {

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else if (percentage[i] >= 50) grade[i] = "D";
            else grade[i] = "F";
        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) +
                    " Percentage: " + percentage[i] +
                    " Grade: " + grade[i]);
        }
    }
}
