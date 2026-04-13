package method_practice.level3;
import java.util.Random;

public class StudentScorecard {

    public static double[][] generatePCM(int students) {

        double[][] scores = new double[students][3];
        // Creates 2D array for Physics, Chemistry, Maths

        Random random = new Random();
        // Creates Random object

        for (int i = 0; i < students; i++) {

            scores[i][0] = 10 + random.nextInt(90);
            // Generates Physics marks (10–99)

            scores[i][1] = 10 + random.nextInt(90);
            // Generates Chemistry marks

            scores[i][2] = 10 + random.nextInt(90);
            // Generates Maths marks
        }

        return scores;
        // Returns generated scores
    }

    public static double[][] calculateResults(double[][] scores) {

        double[][] results = new double[scores.length][3];
        // Stores Total, Average, Percentage

        for (int i = 0; i < scores.length; i++) {

            double total = scores[i][0] + scores[i][1] + scores[i][2];
            // Calculates total marks

            double avg = total / 3;
            // Calculates average

            double percent = (total / 300) * 100;
            // Calculates percentage

            results[i][0] = Math.round(total * 100) / 100.0;
            // Stores rounded total

            results[i][1] = Math.round(avg * 100) / 100.0;
            // Stores rounded average

            results[i][2] = Math.round(percent * 100) / 100.0;
            // Stores rounded percentage
        }

        return results;
        // Returns calculated results
    }

    public static void displayScorecard(double[][] scores, double[][] results) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPercent");
        // Prints header

        for (int i = 0; i < scores.length; i++) {

            System.out.println((i+1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2]);
            // Displays each student's data
        }
    }

    public static void main(String[] args) {

        int students = 5;
        // Number of students

        double[][] scores = generatePCM(students);
        // Generates marks

        double[][] results = calculateResults(scores);
        // Calculates results

        displayScorecard(scores, results);
        // Displays scorecard
    }
}