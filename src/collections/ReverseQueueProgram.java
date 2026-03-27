package collections;

import java.util.*;

public class ReverseQueueProgram {

    public static void main(String[] args) {

        // created queue
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30));

        Stack<Integer> stack = new Stack<>();

        // moving queue to stack
        while(!q.isEmpty()) {
            stack.push(q.remove());
        }

        // moving back to queue
        while(!stack.isEmpty()) {
            q.add(stack.pop());
        }

        System.out.println(q);
    }
}
