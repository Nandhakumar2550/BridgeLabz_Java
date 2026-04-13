package arrays.level2;

import java.util.*;

public class StudentGradeSystem2D {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // creates Scanner object for input

        int numberOfStudents; // variable to store number of students

        System.out.print("Enter number of students: "); // prompt user
        numberOfStudents = input.nextInt(); // read number of students

        double[][] marks = new double[numberOfStudents][3]; // 2D array for marks (Phy, Chem, Math)
        double[] percentage = new double[numberOfStudents]; // array for percentages
        String[] grade = new String[numberOfStudents]; // array for grades

        for (int i = 0; i < numberOfStudents; i++) { // loop for each student

            System.out.println("Enter marks for Student " + (i + 1)); // display student number

            System.out.print("Physics: "); // ask physics marks
            marks[i][0] = input.nextDouble(); // store physics marks

            System.out.print("Chemistry: "); // ask chemistry marks
            marks[i][1] = input.nextDouble(); // store chemistry marks

            System.out.print("Maths: "); // ask maths marks
            marks[i][2] = input.nextDouble(); // store maths marks

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) { // check invalid input
                System.out.println("Invalid marks. Enter again."); // error message
                i--; // repeat same student input
            }
        }

        for (int i = 0; i < numberOfStudents; i++) { // loop to calculate percentage & grade

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3; // calculate average

            if (percentage[i] >= 90) grade[i] = "A"; // assign grade A
            else if (percentage[i] >= 75) grade[i] = "B"; // assign grade B
            else if (percentage[i] >= 60) grade[i] = "C"; // assign grade C
            else if (percentage[i] >= 50) grade[i] = "D"; // assign grade D
            else grade[i] = "F"; // assign grade F
        }

        System.out.println("\nStudent Results:"); // print heading

        for (int i = 0; i < numberOfStudents; i++) { // loop to display results

            System.out.println("Student " + (i + 1) + // print student number
                    " Physics: " + marks[i][0] + // display physics marks
                    " Chemistry: " + marks[i][1] + // display chemistry marks
                    " Maths: " + marks[i][2] + // display maths marks
                    " Percentage: " + percentage[i] + // display percentage
                    " Grade: " + grade[i]); // display grade
        }
    }
}