package collections;

import java.util.*;

public class RotateListProgram {

    public static void main(String[] args) {

        // input list
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int k = 2;

        // rotating list
        for(int i=0; i<k; i++) {
            int first = list.remove(0); // remove first element
            list.add(first);           // add at last
        }

        // printing rotated list
        System.out.println(list);
    }
}
