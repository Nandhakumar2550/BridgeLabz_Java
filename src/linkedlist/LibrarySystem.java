package linkedlist;

// Node class for Doubly Linked List
class BookNode {

    // Book details
    int id;
    String title;
    String author;
    String genre;
    boolean available;

    // Pointers for doubly linked list
    BookNode next, prev;

    // Constructor to initialize node
    BookNode(int id, String title, String author, String genre, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}

// Main class implementing Library System
public class LibrarySystem {

    // Head and tail of doubly linked list
    BookNode head, tail;

    void addBook(int id, String title, String author, String genre, boolean available) {

        // Create new book node
        BookNode newNode = new BookNode(id, title, author, genre, available);

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

    void removeBook(int id) {

        // Start from head
        BookNode temp = head;

        while (temp != null) {

            // If book found
            if (temp.id == id) {

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

    void searchTitle(String title) {

        // Traverse list
        BookNode temp = head;

        while (temp != null) {

            // Check title match
            if (temp.title.equals(title))
                System.out.println("Book Found: " + temp.title);

            temp = temp.next;
        }
    }

    void updateStatus(int id, boolean status) {

        // Traverse list
        BookNode temp = head;

        while (temp != null) {

            // Update availability status
            if (temp.id == id) {
                temp.available = status;
                return;
            }

            temp = temp.next;
        }
    }

    void displayForward() {

        // Traverse from head to tail
        BookNode temp = head;

        while (temp != null) {
            System.out.println(temp.id + " " + temp.title + " " + temp.available);
            temp = temp.next;
        }
    }

    void displayReverse() {

        // Traverse from tail to head
        BookNode temp = tail;

        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.prev;
        }
    }

    int countBooks() {

        int count = 0;

        // Traverse list
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Return total count
        return count;
    }

    public static void main(String[] args) {

        // Create library system
        LibrarySystem lib = new LibrarySystem();

        // Add books
        lib.addBook(1, "Java", "James", "Programming", true);
        lib.addBook(2, "Python", "Guido", "Programming", true);

        // Display books forward
        lib.displayForward();

        // Display total count
        System.out.println("Total Books: " + lib.countBooks());

        // Update availability
        lib.updateStatus(2, false);

        // Display updated list
        lib.displayForward();
    }
}