package stackQueueHashmap;
import java.util.Stack;

class QueueUsingStacks {

    // Stack1 is used for enqueue operation
    Stack<Integer> stack1 = new Stack<>();

    // Stack2 is used for dequeue operation
    Stack<Integer> stack2 = new Stack<>();

    // Method to insert element into queue
    void enqueue(int x) {

        // Push element into stack1
        stack1.push(x);
    }

    // Method to remove element from queue
    int dequeue() {

        // If both stacks are empty, queue is empty
        if (stack1.isEmpty() && stack2.isEmpty()) {

            // Print message
            System.out.println("Queue Empty");

            // Return -1 to indicate empty queue
            return -1;
        }

        // If stack2 is empty, transfer elements from stack1
        if (stack2.isEmpty()) {

            // Move all elements from stack1 to stack2
            while (!stack1.isEmpty()) {

                // Reverse order to maintain FIFO
                stack2.push(stack1.pop());
            }
        }

        // Pop element from stack2 (front of queue)
        return stack2.pop();
    }

    public static void main(String[] args) {

        // Create queue object
        QueueUsingStacks q = new QueueUsingStacks();

        // Enqueue elements
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        // Dequeue and print elements
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}