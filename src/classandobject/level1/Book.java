package classandobject.level1;

public class Book {

    // Instance variable to store book title
    String title;

    // Instance variable to store book author
    String author;

    // Instance variable to store book price
    double price;

    void displayDetails() {

        // Print book title
        System.out.println("Title: " + title);

        // Print book author
        System.out.println("Author: " + author);

        // Print book price
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        // Create object of Book class
        Book b = new Book();

        // Assign title to object
        b.title = "Java Programming";

        // Assign author to object
        b.author = "James Gosling";

        // Assign price to object
        b.price = 499.99;

        // Display book details
        b.displayDetails();
    }
}