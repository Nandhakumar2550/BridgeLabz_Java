package strings.level2;

import java.util.Random;

public class StudentGradeSystem {

    public static int[][] generatePCM(int students) {

        // Random object to generate marks
        Random random = new Random();

        // 2D array: rows = students, columns = Physics, Chemistry, Maths
        int[][] marks = new int[students][3];

        // Generate random marks for each student
        for (int i = 0; i < students; i++)
            for (int j = 0; j < 3; j++)

                // Marks between 10 and 99
                marks[i][j] = 10 + random.nextInt(90);

        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {

        // Result array: Total, Average, Percentage
        double[][] result = new double[marks.length][3];

        // Process each student
        for (int i = 0; i < marks.length; i++) {

            // Calculate total marks
            double total = marks[i][0] + marks[i][1] + marks[i][2];

            // Calculate average
            double avg = total / 3;

            // Calculate percentage (out of 300)
            double percent = (total / 300) * 100;

            // Round total to 2 decimal places
            result[i][0] = Math.round(total * 100) / 100.0;

            // Round average to 2 decimal places
            result[i][1] = Math.round(avg * 100) / 100.0;

            // Round percentage to 2 decimal places
            result[i][2] = Math.round(percent * 100) / 100.0;
        }

        return result;
    }

    public static String getGrade(double percent) {

        // Grade assignment based on percentage
        if (percent >= 90) return "A+";
        if (percent >= 80) return "A";
        if (percent >= 70) return "B";
        if (percent >= 60) return "C";
        if (percent >= 50) return "D";

        // Below 50 is fail
        return "Fail";
    }

    public static void display(int[][] marks, double[][] results) {

        // Print table header
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");

        // Loop through each student
        for (int i = 0; i < marks.length; i++) {

            // Get grade based on percentage
            String grade = getGrade(results[i][2]);

            // Print student details
            System.out.println((i+1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "\t\t" +
                    grade);
        }
    }

    public static void main(String[] args) {

        // Number of students
        int students = 5;

        // Generate marks for students
        int[][] marks = generatePCM(students);

        // Calculate total, average, percentage
        double[][] results = calculateResults(marks);

        // Display final report
        display(marks, results);
    }
}