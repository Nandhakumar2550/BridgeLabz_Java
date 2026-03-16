package linkedList;
class TaskNode {

    int id;
    String name;
    int priority;
    String dueDate;

    TaskNode next;

    TaskNode(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

public class TaskScheduler {

    TaskNode head = null, tail = null;

    void addTask(int id, String name, int priority, String date) {

        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    void removeTask(int id) {

        TaskNode temp = head, prev = null;

        do {

            if (temp.id == id) {

                if (prev != null)
                    prev.next = temp.next;

                if (temp == head)
                    head = temp.next;

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

        if (head == null)
            return;

        do {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {

        TaskScheduler t = new TaskScheduler();

        t.addTask(1, "Coding", 1, "Tomorrow");
        t.addTask(2, "Project", 2, "Monday");

        t.display();
    }
}