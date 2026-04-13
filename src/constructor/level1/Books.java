package constructor.level1;

public class Books {

    // Instance variable to store book title
    String title;

    // Instance variable to store book author
    String author;

    // Instance variable to store book price
    double price;

    // Boolean to track availability of book
    boolean available;

    // Parameterized constructor to initialize book details
    Books(String t, String a, double p) {

        // Assign title
        title = t;

        // Assign author
        author = a;

        // Assign price
        price = p;

        // Initially book is available
        available = true;
    }

    void borrowBook() {

        // Check if book is available
        if (available) {

            // Mark book as borrowed
            available = false;

            // Success message
            System.out.println("Book borrowed successfully.");

        } else {

            // If already borrowed
            System.out.println("Book not available.");
        }
    }

    void display() {

        // Display book title
        System.out.println("Title: " + title);

        // Display author
        System.out.println("Author: " + author);

        // Display price
        System.out.println("Price: " + price);

        // Display availability status
        System.out.println("Available: " + available);
    }

    public static void main(String[] args) {

        // Create Books object using constructor
        Books b = new Books("Data Structures", "Mark Allen", 400);

        // Display initial details
        b.display();
        System.out.println();

        // Borrow the book
        b.borrowBook();

        // Display updated details
        b.display();
    }
}