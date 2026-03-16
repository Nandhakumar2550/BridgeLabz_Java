package linkedlist;

class ProcessNode {

    int id;
    int burst;
    ProcessNode next;

    ProcessNode(int id, int burst) {
        this.id = id;
        this.burst = burst;
    }
}

public class RoundRobin {

    ProcessNode head = null, tail = null;

    void addProcess(int id, int burst) {

        ProcessNode newNode = new ProcessNode(id, burst);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    void execute(int quantum) {

        ProcessNode temp = head;

        while (head != null) {

            if (temp.burst <= quantum) {

                System.out.println("Process " + temp.id + " completed");

                if (temp == head && temp == tail) {
                    head = tail = null;
                    return;
                }

                tail.next = temp.next;
                head = temp.next;
                temp = head;
            }

            else {

                temp.burst -= quantum;
                System.out.println("Process " + temp.id + " remaining burst " + temp.burst);
                tail = temp;
                temp = temp.next;
                head = temp;
            }
        }
    }

    public static void main(String[] args) {

        RoundRobin rr = new RoundRobin();

        rr.addProcess(1, 10);
        rr.addProcess(2, 5);
        rr.addProcess(3, 8);

        rr.execute(4);
    }
}
