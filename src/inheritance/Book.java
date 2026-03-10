package inheritance;

public class Book {
    String title;
    int publicationYear;
}

class Author extends Book {

    String name;
    String bio;

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + publicationYear);
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}
