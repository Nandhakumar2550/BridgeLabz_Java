package stackQueueHashmap;

import java.util.Stack;

public class SortStack {

    // Method to insert an element into sorted stack at correct position
    static void sortedInsert(Stack<Integer> stack, int x) {

        // If stack is empty OR x is greater than top element
        if (stack.isEmpty() || x > stack.peek()) {

            // Push x into stack
            stack.push(x);
            return;
        }

        // Remove top element
        int temp = stack.pop();

        // Recursively insert x into correct position
        sortedInsert(stack, x);

        // Push the removed element back
        stack.push(temp);
    }

    // Method to sort stack using recursion
    static void sortStack(Stack<Integer> stack) {

        // If stack is not empty
        if (!stack.isEmpty()) {

            // Remove top element
            int x = stack.pop();

            // Recursively sort remaining stack
            sortStack(stack);

            // Insert removed element at correct position
            sortedInsert(stack, x);
        }
    }

    public static void main(String[] args) {

        // Create stack
        Stack<Integer> stack = new Stack<>();

        // Push elements into stack
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        // Sort the stack
        sortStack(stack);

        // Print sorted stack
        System.out.println(stack);
    }
}