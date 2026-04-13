package linkedlist;

// Node class representing a process in circular linked list
class ProcessNode {

    // Process ID
    int id;

    // Burst time (execution time required)
    int burst;

    // Pointer to next process
    ProcessNode next;

    // Constructor to initialize process
    ProcessNode(int id, int burst) {
        this.id = id;
        this.burst = burst;
    }
}

// Main class implementing Round Robin Scheduling
public class RoundRobin {

    // Head and tail of circular linked list
    ProcessNode head = null, tail = null;

    void addProcess(int id, int burst) {

        // Create new process node
        ProcessNode newNode = new ProcessNode(id, burst);

        // If list is empty
        if (head == null) {
            head = tail = newNode;

            // Point to itself (circular)
            tail.next = head;
            return;
        }

        // Insert at end
        tail.next = newNode;
        tail = newNode;

        // Maintain circular structure
        tail.next = head;
    }

    void execute(int quantum) {

        // Start from head
        ProcessNode temp = head;

        // Continue until all processes are completed
        while (head != null) {

            // If process can complete in this quantum
            if (temp.burst <= quantum) {

                System.out.println("Process " + temp.id + " completed");

                // If only one process left
                if (temp == head && temp == tail) {
                    head = tail = null;
                    return;
                }

                // Remove current process from circular list
                tail.next = temp.next;
                head = temp.next;

                // Move to next process
                temp = head;
            }

            else {

                // Reduce burst time
                temp.burst -= quantum;

                System.out.println("Process " + temp.id + " remaining burst " + temp.burst);

                // Move current process to end (round robin rotation)
                tail = temp;
                temp = temp.next;
                head = temp;
            }
        }
    }

    public static void main(String[] args) {

        // Create RoundRobin scheduler
        RoundRobin rr = new RoundRobin();

        // Add processes
        rr.addProcess(1, 10);
        rr.addProcess(2, 5);
        rr.addProcess(3, 8);

        // Execute with time quantum = 4
        rr.execute(4);
    }
}