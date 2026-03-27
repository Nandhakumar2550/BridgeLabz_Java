package collections;

import java.util.*;

public class SetEqualityProgram {

    public static void main(String[] args) {

        // created two sets
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,2,1));

        // checking equality
        System.out.println(s1.equals(s2));
    }
}