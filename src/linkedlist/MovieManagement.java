package linkedlist;

// Node class for Doubly Linked List
class MovieNode {

    // Movie details
    String title;
    String director;
    int year;
    double rating;

    // Pointers for doubly linked list
    MovieNode next, prev;

    // Constructor to initialize movie data
    MovieNode(String t, String d, int y, double r) {
        title = t;
        director = d;
        year = y;
        rating = r;
    }
}

// Main class for Movie Management System
public class MovieManagement {

    // Head and tail pointers
    MovieNode head, tail;

    void addEnd(String t, String d, int y, double r) {

        // Create new node
        MovieNode newNode = new MovieNode(t, d, y, r);

        // If list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Add node at end
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void remove(String title) {

        // Start from head
        MovieNode temp = head;

        while (temp != null) {

            // Find movie by title
            if (temp.title.equals(title)) {

                // Update previous link
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next; // Removing head

                // Update next link
                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev; // Removing tail

                return;
            }

            temp = temp.next;
        }
    }

    void searchDirector(String director) {

        // Traverse list
        MovieNode temp = head;

        while (temp != null) {

            // Print movies by given director
            if (temp.director.equals(director))
                System.out.println(temp.title);

            temp = temp.next;
        }
    }

    void displayForward() {

        // Traverse from head to tail
        MovieNode temp = head;

        while (temp != null) {
            System.out.println(temp.title + " " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {

        // Traverse from tail to head
        MovieNode temp = tail;

        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {

        // Create MovieManagement object
        MovieManagement m = new MovieManagement();

        // Add movies
        m.addEnd("Inception", "Nolan", 2010, 9);
        m.addEnd("Avatar", "Cameron", 2009, 8.5);

        // Display forward
        m.displayForward();

        // Display reverse
        System.out.println("Reverse:");
        m.displayReverse();
    }
}