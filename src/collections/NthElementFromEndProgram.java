package collections;

import java.util.*;

public class NthElementFromEndProgram {

    public static void main(String[] args) {

        // input linkedlist
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));

        int n = 2;

        // using two pointer method
        int fast = 0, slow = 0;

        while(fast < list.size()) {
            if(fast - slow > n - 1) {
                slow++;
            }
            fast++;
        }

        // printing nth element from end
        System.out.println(list.get(slow));
    }
}