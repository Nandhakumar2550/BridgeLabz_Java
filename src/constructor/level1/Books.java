package constructor.level1;

public class Books {
    String title;
    String author;
    double price;
    boolean available;

    Books(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }

    public static void main(String[] args) {

        Books b = new Books("Data Structures", "Mark Allen", 400);

        b.display();
        System.out.println();

        b.borrowBook();
        b.display();
    }
}
