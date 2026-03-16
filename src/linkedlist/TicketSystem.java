package linkedlist;

class TicketNode {

    int id;
    String customer;
    String movie;
    int seat;
    String time;

    TicketNode next;

    TicketNode(int id, String customer, String movie, int seat, String time) {
        this.id = id;
        this.customer = customer;
        this.movie = movie;
        this.seat = seat;
        this.time = time;
    }
}

public class TicketSystem {

    TicketNode head = null, tail = null;

    void addTicket(int id, String customer, String movie, int seat, String time) {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    void removeTicket(int id) {

        TicketNode temp = head, prev = null;

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

        TicketNode temp = head;

        if (head == null)
            return;

        do {
            System.out.println(temp.id + " " + temp.customer + " " + temp.movie);
            temp = temp.next;
        } while (temp != head);
    }

    int totalTickets() {

        int count = 0;
        TicketNode temp = head;

        if (head == null)
            return 0;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    public static void main(String[] args) {

        TicketSystem t = new TicketSystem();

        t.addTicket(1, "Arun", "Avatar", 12, "10AM");
        t.addTicket(2, "Rahul", "Inception", 15, "1PM");

        t.display();

        System.out.println("Total Tickets: " + t.totalTickets());
    }
}
