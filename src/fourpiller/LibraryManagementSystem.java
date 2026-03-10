package fourpiller;
abstract class LibraryItem{

    String title;

    LibraryItem(String title){
        this.title=title;
    }

    abstract int getLoanDuration();

    void getItemDetails(){
        System.out.println("Item:"+title);
    }
}

class Book extends LibraryItem{

    Book(String title){
        super(title);
    }

    int getLoanDuration(){
        return 14;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args){

        LibraryItem item=new Book("Java Programming");

        item.getItemDetails();
        System.out.println("Loan Days:"+item.getLoanDuration());
    }
}
