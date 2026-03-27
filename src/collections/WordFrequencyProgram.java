package collections;

import java.util.*;

public class WordFrequencyProgram {

    public static void main(String[] args) {

        String text = "Hello world hello Java";

        // converting to lowercase
        text = text.toLowerCase();

        String[] words = text.split(" ");

        Map<String, Integer> map = new HashMap<>();

        // counting words
        for(String w : words) {
            map.put(w, map.getOrDefault(w,0)+1);
        }

        System.out.println(map);
    }
}
