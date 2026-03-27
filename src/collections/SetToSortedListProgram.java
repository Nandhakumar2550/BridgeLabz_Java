package collections;

import java.util.*;

public class SetToSortedListProgram {

    public static void main(String[] args) {

        // created set
        Set<Integer> set = new HashSet<>(Arrays.asList(5,3,9,1));

        // converting to list
        List<Integer> list = new ArrayList<>(set);

        // sorting list
        Collections.sort(list);

        System.out.println(list);
    }
}
