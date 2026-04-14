package collections;

import java.util.*;

public class BinaryNumberGenerator {

    public static void main(String[] args) {

        // Number of binary numbers to generate
        int n = 5;

        // Queue to store binary numbers
        Queue<String> q = new LinkedList<>();

        // Add first binary number
        q.add("1");

        // Generate binary numbers
        for(int i = 0; i < n; i++) {

            // Remove front element from queue
            String s = q.remove();

            // Print current binary number
            System.out.println(s);

            // Append "0" to current string and add to queue
            q.add(s + "0");

            // Append "1" to current string and add to queue
            q.add(s + "1");
        }
    }
}