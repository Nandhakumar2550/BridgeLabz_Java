package generics;

// Generic product class
class Product<T> {
    String name; // product name
    double price; // product price
    T category; // generic category type

    // constructor
    Product(String name, double price, T category) {
        this.name = name; // assigning product name
        this.price = price; // assigning price
        this.category = category; // assigning category
    }

    // display product details
    void show() {
        System.out.println(name + " " + price); // printing name and updated price
    }
}

// Utility class for operations
class MarketplaceUtil {

    // generic method to apply discount
    static <T extends Product<?>> void discount(T p, double percent) {
        p.price = p.price - (p.price * percent / 100); // reducing price by given percentage
    }
}

// Main class
public class OnlineMarketplaceSystem {

    public static void main(String[] args) {

        // created product object
        Product<String> p = new Product<>("Book", 500, "Education"); // creating product with category type String

        // applying discount
        MarketplaceUtil.discount(p, 10); // applying 10% discount

        // displaying updated price
        p.show(); // showing product details after discount
    }
}