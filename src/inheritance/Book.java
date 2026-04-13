package inheritance;

// Base class representing a book
public class Book {

    // Title of the book
    String title;

    // Year of publication
    int publicationYear;
}

// Author class inheriting Book
class Author extends Book {

    // Name of the author
    String name;

    // Short biography of the author
    String bio;

    void displayInfo() {

        // Display book title (inherited from Book)
        System.out.println("Title: " + title);

        // Display publication year (inherited from Book)
        System.out.println("Year: " + publicationYear);

        // Display author name
        System.out.println("Author: " + name);

        // Display author biography
        System.out.println("Bio: " + bio);
    }
}