package strings.level2;
import java.util.Scanner;
public class ShortestLongestWordProgram {
    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Manual split using charAt()
    public static String[] splitText(String text) {

        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++)
            if (text.charAt(i) == ' ')
                wordCount++;

        String[] words = new String[wordCount];

        int start = 0, index = 0;

        for (int i = 0; i <= length; i++) {

            if (i == length || text.charAt(i) == ' ') {

                String word = "";

                for (int j = start; j < i; j++)
                    word += text.charAt(j);

                words[index++] = word;
                start = i + 1;
            }
        }

        return words;
    }

    // Create 2D array with word and length
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    // Find shortest and longest word
    public static String[] findShortestLongest(String[][] data) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        String shortest = "";
        String longest = "";

        for (int i = 0; i < data.length; i++) {

            int length = Integer.parseInt(data[i][1]);

            if (length < min) {
                min = length;
                shortest = data[i][0];
            }

            if (length > max) {
                max = length;
                longest = data[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = input.nextLine();

        String[] words = splitText(text);
        String[][] wordData = createWordLengthArray(words);

        String[] result = findShortestLongest(wordData);

        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordData.length; i++)
            System.out.println(wordData[i][0] + "\t" + wordData[i][1]);

        System.out.println("\nShortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
    }
}
