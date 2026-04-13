package objectModeling;

import java.util.*;

// Book class representing a book entity
public class Book {

    // Title of the book
    String title;

    // Author of the book
    String author;

    // Constructor to initialize book details
    Book(String title, String author) {

        // Assign title
        this.title = title;

        // Assign author
        this.author = author;
    }

    void display() {

        // Display book details
        System.out.println(title + " by " + author);
    }
}

// Library class representing a collection of books
class Library {

    // Name of the library
    String name;

    // List to store books (HAS-A relationship)
    ArrayList<Book> books = new ArrayList<>();

    // Constructor to initialize library name
    Library(String name) {

        // Assign library name
        this.name = name;
    }

    void addBook(Book b) {

        // Add book to library collection
        books.add(b);
    }

    void showBooks() {

        // Display library name
        System.out.println("Library: " + name);

        // Loop through books and display each
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {

        // Create Book objects
        Book b1 = new Book("Java", "James Gosling");
        Book b2 = new Book("Python", "Guido");

        // Create Library objects
        Library l1 = new Library("City Library");
        Library l2 = new Library("College Library");

        // Add books to first library
        l1.addBook(b1);
        l1.addBook(b2);

        // Add book to second library
        l2.addBook(b2);

        // Display books in both libraries
        l1.showBooks();
        l2.showBooks();
    }
}