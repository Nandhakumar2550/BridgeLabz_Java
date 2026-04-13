package linkedlist;

// Node class representing a movie ticket
class TicketNode {

    // Ticket details
    int id;
    String customer;
    String movie;
    int seat;
    String time;

    // Pointer to next node (circular list)
    TicketNode next;

    // Constructor to initialize ticket data
    TicketNode(int id, String customer, String movie, int seat, String time) {
        this.id = id;
        this.customer = customer;
        this.movie = movie;
        this.seat = seat;
        this.time = time;
    }
}

// Main class for Ticket Booking System
public class TicketSystem {

    // Head and tail of circular linked list
    TicketNode head = null, tail = null;

    void addTicket(int id, String customer, String movie, int seat, String time) {

        // Create new ticket node
        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        // If list is empty
        if (head == null) {
            head = tail = newNode;

            // Make circular link
            tail.next = head;
            return;
        }

        // Insert at end
        tail.next = newNode;
        tail = newNode;

        // Maintain circular structure
        tail.next = head;
    }

    void removeTicket(int id) {

        // temp → current node, prev → previous node
        TicketNode temp = head, prev = null;

        // Traverse circular list
        do {

            // If ticket found
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

        TicketNode temp = head;

        // If list is empty
        if (head == null)
            return;

        // Traverse circular list
        do {
            System.out.println(temp.id + " " + temp.customer + " " + temp.movie);
            temp = temp.next;
        } while (temp != head);
    }

    int totalTickets() {

        int count = 0;

        TicketNode temp = head;

        // If empty list
        if (head == null)
            return 0;

        // Count nodes in circular list
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    public static void main(String[] args) {

        // Create TicketSystem
        TicketSystem t = new TicketSystem();

        // Add tickets
        t.addTicket(1, "Arun", "Avatar", 12, "10AM");
        t.addTicket(2, "Rahul", "Inception", 15, "1PM");

        // Display tickets
        t.display();

        // Display total tickets
        System.out.println("Total Tickets: " + t.totalTickets());
    }
}