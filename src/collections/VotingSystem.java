package collections;

import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        // HashMap to store votes
        Map<String, Integer> votes = new HashMap<>();

        // adding votes
        votes.put("A", 10);
        votes.put("B", 20);
        votes.put("C", 15);

        // LinkedHashMap to maintain order
        Map<String, Integer> linked = new LinkedHashMap<>(votes);

        // TreeMap to sort
        Map<String, Integer> sorted = new TreeMap<>(votes);

        // display results
        System.out.println("Votes: " + votes);
        System.out.println("Insertion Order: " + linked);
        System.out.println("Sorted: " + sorted);
    }
}
