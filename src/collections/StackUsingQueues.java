package collections;

import java.util.*;

public class StackUsingQueues {

    // Queue1 will store elements in stack order
    static Queue<Integer> q1 = new LinkedList<>();

    // Queue2 is used as helper queue
    static Queue<Integer> q2 = new LinkedList<>();

    // Method to push element into stack
    static void push(int x) {

        // Add new element to q2
        q2.add(x);

        // Move all elements from q1 to q2
        while(!q1.isEmpty()) {

            // This ensures new element stays at front (LIFO order)
            q2.add(q1.remove());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Method to pop element from stack
    static int pop() {

        // Remove element from q1 (top of stack)
        return q1.remove();
    }

    public static void main(String[] args) {

        // Push elements into stack
        push(1);
        push(2);
        push(3);

        // Pop and print top element (should be 3)
        System.out.println(pop());
    }
}