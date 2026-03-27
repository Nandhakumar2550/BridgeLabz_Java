package collections;

import java.util.*;

public class RemoveDuplicatesProgram {

    public static void main(String[] args) {

        // input list
        List<Integer> list = Arrays.asList(3,1,2,2,3,4);

        // LinkedHashSet maintains order
        Set<Integer> set = new LinkedHashSet<>(list);

        // converting back to list
        List<Integer> result = new ArrayList<>(set);

        // printing result
        System.out.println(result);
    }
}
