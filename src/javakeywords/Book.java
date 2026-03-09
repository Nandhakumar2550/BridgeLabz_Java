package javakeywords;

public class Book {
    static String libraryName = "City Library";

    String title;
    String author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {

        Book b = new Book("Java Basics", "James Gosling", "ISBN101");

        displayLibraryName();

        if (b instanceof Book) {
            b.display();
        }
    }
}
