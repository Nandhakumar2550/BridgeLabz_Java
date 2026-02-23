package arrays.level2;
import java.util.*;
public class StudentGradeSystem2D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfStudents;

        System.out.print("Enter number of students: ");
        numberOfStudents = input.nextInt();

        double[][] marks = new double[numberOfStudents][3]; // Physics, Chemistry, Maths
        double[] percentage = new double[numberOfStudents];
        String[] grade = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = input.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = input.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = input.nextDouble();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks. Enter again.");
                i--;
            }
        }

        for (int i = 0; i < numberOfStudents; i++) {

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else if (percentage[i] >= 50) grade[i] = "D";
            else grade[i] = "F";
        }

        System.out.println("\nStudent Results:");

        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println("Student " + (i + 1) +
                    " Physics: " + marks[i][0] +
                    " Chemistry: " + marks[i][1] +
                    " Maths: " + marks[i][2] +
                    " Percentage: " + percentage[i] +
                    " Grade: " + grade[i]);
        }
    }
}
