package linkedlist;

// Node class representing a task in circular linked list
class TaskNode {

    // Task details
    int id;
    String name;
    int priority;
    String dueDate;

    // Pointer to next task
    TaskNode next;

    // Constructor to initialize task
    TaskNode(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

// Main class for Task Scheduling
public class TaskScheduler {

    // Head and tail of circular linked list
    TaskNode head = null, tail = null;

    void addTask(int id, String name, int priority, String date) {

        // Create new task node
        TaskNode newNode = new TaskNode(id, name, priority, date);

        // If list is empty
        if (head == null) {
            head = tail = newNode;

            // Circular link
            tail.next = head;
            return;
        }

        // Add at end
        tail.next = newNode;
        tail = newNode;

        // Maintain circular structure
        tail.next = head;
    }

    void removeTask(int id) {

        // temp → current node, prev → previous node
        TaskNode temp = head, prev = null;

        // Loop through circular list
        do {

            // If task found
            if (temp.id == id) {

                // If not first node
                if (prev != null)
                    prev.next = temp.next;

                // If removing head
                if (temp == head)
                    head = temp.next;

                // If removing tail
                if (temp == tail)
                    tail = prev;

                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);
    }

    void display() {

        TaskNode temp = head;

        // If list is empty
        if (head == null)
            return;

        // Traverse circular list
        do {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {

        // Create TaskScheduler
        TaskScheduler t = new TaskScheduler();

        // Add tasks
        t.addTask(1, "Coding", 1, "Tomorrow");
        t.addTask(2, "Project", 2, "Monday");

        // Display tasks
        t.display();
    }
}