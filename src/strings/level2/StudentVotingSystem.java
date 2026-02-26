package strings.level2;
import java.util.Random;
public class StudentVotingSystem {
    public static int[] generateAges(int n) {

        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++)
            ages[i] = random.nextInt(40); // 0–39

        return ages;
    }

    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18)
                result[i][1] = "Can Vote";
            else
                result[i][1] = "Cannot Vote";
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println("Age\tStatus");

        for (int i = 0; i < data.length; i++)
            System.out.println(data[i][0] + "\t" + data[i][1]);
    }

    public static void main(String[] args) {

        int[] ages = generateAges(10);
        String[][] result = checkVoting(ages);

        display(result);
    }
}
