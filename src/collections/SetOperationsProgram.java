package collections;

import java.util.*;

public class SetOperationsProgram {

    public static void main(String[] args) {

        // created sets
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5));

        // union
        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);

        // intersection
        Set<Integer> inter = new HashSet<>(s1);
        inter.retainAll(s2);

        // printing results
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + inter);
    }
}
