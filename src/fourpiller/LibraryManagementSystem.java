package fourpiller;

// Abstract class representing a generic library item
abstract class LibraryItem{

    // Title of the item (book, magazine, etc.)
    String title;

    // Constructor to initialize title
    LibraryItem(String title){
        this.title = title;
    }

    // Abstract method to define loan duration
    abstract int getLoanDuration();

    // Method to display item details
    void getItemDetails(){

        // Print item title
        System.out.println("Item:" + title);
    }
}

// Book class inheriting from LibraryItem
class Book extends LibraryItem{

    // Constructor calling parent constructor
    Book(String title){
        super(title);
    }

    // Loan duration for books (14 days)
    int getLoanDuration(){
        return 14;
    }
}

// Main class
public class LibraryManagementSystem {

    public static void main(String[] args){

        // Polymorphism: parent reference holding child object
        LibraryItem item = new Book("Java Programming");

        // Display item details
        item.getItemDetails();

        // Display loan duration
        System.out.println("Loan Days:" + item.getLoanDuration());
    }
}