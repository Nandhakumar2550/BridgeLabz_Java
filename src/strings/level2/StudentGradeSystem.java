package strings.level2;
import java.util.Random;
public class StudentGradeSystem {
    public static int[][] generatePCM(int students) {

        Random random = new Random();
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++)
            for (int j = 0; j < 3; j++)
                marks[i][j] = 10 + random.nextInt(90);

        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3;
            double percent = (total / 300) * 100;

            result[i][0] = Math.round(total * 100) / 100.0;
            result[i][1] = Math.round(avg * 100) / 100.0;
            result[i][2] = Math.round(percent * 100) / 100.0;
        }

        return result;
    }

    public static String getGrade(double percent) {

        if (percent >= 90) return "A+";
        if (percent >= 80) return "A";
        if (percent >= 70) return "B";
        if (percent >= 60) return "C";
        if (percent >= 50) return "D";
        return "Fail";
    }

    public static void display(int[][] marks, double[][] results) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");

        for (int i = 0; i < marks.length; i++) {

            String grade = getGrade(results[i][2]);

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

        int students = 5;

        int[][] marks = generatePCM(students);
        double[][] results = calculateResults(marks);

        display(marks, results);
    }

}
