package searchingAndFileHanding;

import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        // Input string with duplicate characters
        String str = "programming";

        // StringBuilder to store result (unique characters)
        StringBuilder result = new StringBuilder();

        // HashSet to track characters already seen
        HashSet<Character> set = new HashSet<>();

        // Convert string to character array and iterate
        for(char c : str.toCharArray()){

            // Check if character is not already in set
            if(!set.contains(c)){

                // Append character to result
                result.append(c);

                // Add character to set
                set.add(c);
            }
        }

        // Print final string without duplicates
        System.out.println(result.toString());
    }
}