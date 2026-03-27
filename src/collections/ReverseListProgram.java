package collections;

import java.util.*;

public class ReverseListProgram {

    public static void main(String[] args) {

        // created ArrayList
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        // reversing list manually
        for(int i=0, j=list.size()-1; i<j; i++, j--) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }

        // printing reversed list
        System.out.println(list);

        // created LinkedList
        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        // reversing linkedlist manually
        for(int i=0, j=l.size()-1; i<j; i++, j--) {
            int temp = l.get(i);
            l.set(i, l.get(j));
            l.set(j, temp);
        }

        System.out.println(l);
    }
}