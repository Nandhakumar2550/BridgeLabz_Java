package collections;

import java.util.*;

public class ReverseQueueProgram {

    public static void main(String[] args) {

        // Create queue with elements
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30));

        // Stack to help reverse the queue
        Stack<Integer> stack = new Stack<>();

        // Move all elements from queue to stack
        while(!q.isEmpty()) {

            // Remove element from queue and push to stack
            stack.push(q.remove());
        }

        // Move elements back from stack to queue
        while(!stack.isEmpty()) {

            // Pop from stack and add back to queue
            q.add(stack.pop());
        }

        // Print reversed queue
        System.out.println(q);
    }
}