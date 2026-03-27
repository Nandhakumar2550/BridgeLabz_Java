package collections;

import java.util.*;

public class SubsetCheckProgram {

    public static void main(String[] args) {

        // created sets
        Set<Integer> s1 = new HashSet<>(Arrays.asList(2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(1,2,3,4));

        // checking subset
        System.out.println(s2.containsAll(s1));
    }
}
