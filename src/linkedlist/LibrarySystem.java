package linkedlist;

class BookNode {
    int id;
    String title;
    String author;
    String genre;
    boolean available;

    BookNode next, prev;

    BookNode(int id, String title, String author, String genre, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}

public class LibrarySystem {

    BookNode head, tail;

    void addBook(int id, String title, String author, String genre, boolean available) {

        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void removeBook(int id) {

        BookNode temp = head;

        while (temp != null) {

            if (temp.id == id) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                return;
            }

            temp = temp.next;
        }
    }

    void searchTitle(String title) {

        BookNode temp = head;

        while (temp != null) {

            if (temp.title.equals(title))
                System.out.println("Book Found: " + temp.title);

            temp = temp.next;
        }
    }

    void updateStatus(int id, boolean status) {

        BookNode temp = head;

        while (temp != null) {

            if (temp.id == id) {
                temp.available = status;
                return;
            }

            temp = temp.next;
        }
    }

    void displayForward() {

        BookNode temp = head;

        while (temp != null) {
            System.out.println(temp.id + " " + temp.title + " " + temp.available);
            temp = temp.next;
        }
    }

    void displayReverse() {

        BookNode temp = tail;

        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.prev;
        }
    }

    int countBooks() {

        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {

        LibrarySystem lib = new LibrarySystem();

        lib.addBook(1, "Java", "James", "Programming", true);
        lib.addBook(2, "Python", "Guido", "Programming", true);

        lib.displayForward();

        System.out.println("Total Books: " + lib.countBooks());

        lib.updateStatus(2, false);

        lib.displayForward();
    }
}
