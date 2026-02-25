package method_practice.level3;
import java.util.Random;
public class StudentScorecard {
    public static double[][] generatePCM(int students) {

        double[][] scores = new double[students][3];
        Random random = new Random();

        for (int i = 0; i < students; i++) {
            scores[i][0] = 10 + random.nextInt(90);
            scores[i][1] = 10 + random.nextInt(90);
            scores[i][2] = 10 + random.nextInt(90);
        }
        return scores;
    }

    public static double[][] calculateResults(double[][] scores) {

        double[][] results = new double[scores.length][3]; // Total, Avg, %

        for (int i = 0; i < scores.length; i++) {

            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3;
            double percent = (total / 300) * 100;

            results[i][0] = Math.round(total * 100) / 100.0;
            results[i][1] = Math.round(avg * 100) / 100.0;
            results[i][2] = Math.round(percent * 100) / 100.0;
        }
        return results;
    }

    public static void displayScorecard(double[][] scores, double[][] results) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPercent");

        for (int i = 0; i < scores.length; i++) {

            System.out.println((i+1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2]);
        }
    }

    public static void main(String[] args) {

        int students = 5;

        double[][] scores = generatePCM(students);
        double[][] results = calculateResults(scores);

        displayScorecard(scores, results);
    }
}
