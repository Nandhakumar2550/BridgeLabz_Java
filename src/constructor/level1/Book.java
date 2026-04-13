package constructor.level1;

public class Book {

    // Instance variable to store book title
    String title;

    // Instance variable to store book author
    String author;

    // Instance variable to store book price
    double price;

    // Default Constructor (no arguments)
    Book() {

        // Assign default values
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor (with arguments)
    Book(String t, String a, double p) {

        // Assign values passed during object creation
        title = t;
        author = a;
        price = p;
    }

    void display() {

        // Display book title
        System.out.println("Title: " + title);

        // Display book author
        System.out.println("Author: " + author);

        // Display book price
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        // Create object using default constructor
        Book b1 = new Book();

        // Create object using parameterized constructor
        Book b2 = new Book("Java Programming", "James Gosling", 500);

        // Display details of first book
        b1.display();

        // Print blank line for formatting
        System.out.println();

        // Display details of second book
        b2.display();
    }
}