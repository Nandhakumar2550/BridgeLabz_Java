package generics;

// Generic product class
class Product<T> {
    String name;
    double price;
    T category;

    // constructor
    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // display product details
    void show() {
        System.out.println(name + " " + price);
    }
}

// Utility class for operations
class MarketplaceUtil {

    // generic method to apply discount
    static <T extends Product<?>> void discount(T p, double percent) {
        p.price = p.price - (p.price * percent / 100);
    }
}

// Main class
public class OnlineMarketplaceSystem {

    public static void main(String[] args) {

        // created product object
        Product<String> p = new Product<>("Book", 500, "Education");

        // applying discount
        MarketplaceUtil.discount(p, 10);

        // displaying updated price
        p.show();
    }
}
