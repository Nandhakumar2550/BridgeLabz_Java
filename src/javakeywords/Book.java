package javakeywords;

public class Book {

    // Static variable shared across all Book objects
    static String libraryName = "City Library";

    // Instance variable for book title
    String title;

    // Instance variable for book author
    String author;

    // Final variable (cannot be changed once assigned)
    final String isbn;

    // Constructor to initialize book details
    Book(String title, String author, String isbn) {

        // 'this' refers to current object
        this.title = title;

        // Assign author
        this.author = author;

        // Assign ISBN (final)
        this.isbn = isbn;
    }

    static void displayLibraryName() {

        // Static method accessing static variable
        System.out.println("Library: " + libraryName);
    }

    void display() {

        // Display book title
        System.out.println("Title: " + title);

        // Display author name
        System.out.println("Author: " + author);

        // Display ISBN
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {

        // Create Book object
        Book b = new Book("Java Basics", "James Gosling", "ISBN101");

        // Call static method
        displayLibraryName();

        // instanceof checks object type
        if (b instanceof Book) {

            // Call instance method
            b.display();
        }
    }
}