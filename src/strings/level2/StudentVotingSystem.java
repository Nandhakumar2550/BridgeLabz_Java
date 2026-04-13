package strings.level2;

import java.util.Random;

public class StudentVotingSystem {

    public static int[] generateAges(int n) {

        // Random object to generate ages
        Random random = new Random();

        // Array to store ages of students
        int[] ages = new int[n];

        // Generate random ages between 0 and 39
        for (int i = 0; i < n; i++)
            ages[i] = random.nextInt(40); // 0–39

        return ages;
    }

    public static String[][] checkVoting(int[] ages) {

        // 2D array: column 0 = age, column 1 = voting status
        String[][] result = new String[ages.length][2];

        // Loop through all ages
        for (int i = 0; i < ages.length; i++) {

            // Store age as string
            result[i][0] = String.valueOf(ages[i]);

            // Check voting eligibility
            if (ages[i] >= 18)
                result[i][1] = "Can Vote";
            else
                result[i][1] = "Cannot Vote";
        }

        return result;
    }

    public static void display(String[][] data) {

        // Print table header
        System.out.println("Age\tStatus");

        // Print each record
        for (int i = 0; i < data.length; i++)
            System.out.println(data[i][0] + "\t" + data[i][1]);
    }

    public static void main(String[] args) {

        // Generate random ages for 10 students
        int[] ages = generateAges(10);

        // Check voting eligibility
        String[][] result = checkVoting(ages);

        // Display results
        display(result);
    }
}