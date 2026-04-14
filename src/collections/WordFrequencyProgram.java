package collections;

import java.util.*;

public class WordFrequencyProgram {

    public static void main(String[] args) {

        // Input text
        String text = "Hello world hello Java";

        // Convert text to lowercase for case-insensitive counting
        text = text.toLowerCase();

        // Split text into words using space as delimiter
        String[] words = text.split(" ");

        // Map to store word → frequency
        Map<String, Integer> map = new HashMap<>();

        // Traverse each word
        for(String w : words) {

            // Update frequency count
            // If word exists → increment
            // Else → default 0 + 1
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        // Print word frequency map
        System.out.println(map);
    }
}