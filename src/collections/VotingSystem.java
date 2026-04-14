package collections;

import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        // HashMap to store candidate → votes (no order)
        Map<String, Integer> votes = new HashMap<>();

        // Add votes for candidates
        votes.put("A", 10);
        votes.put("B", 20);
        votes.put("C", 15);

        // LinkedHashMap to maintain insertion order
        Map<String, Integer> linked = new LinkedHashMap<>(votes);

        // TreeMap to sort by candidate name (key)
        Map<String, Integer> sorted = new TreeMap<>(votes);

        // Display original votes (unordered)
        System.out.println("Votes: " + votes);

        // Display votes in insertion order
        System.out.println("Insertion Order: " + linked);

        // Display sorted votes (by key)
        System.out.println("Sorted: " + sorted);
    }
}