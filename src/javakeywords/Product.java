package javakeywords;

public class Product {
    static double discount = 10;

    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void display() {
        double total = price * quantity;
        double finalPrice = total - (total * discount / 100);

        System.out.println("Product: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Total Price after Discount: " + finalPrice);
    }

    public static void main(String[] args) {

        Product p = new Product("Laptop", 50000, 1, 1001);

        if (p instanceof Product) {
            p.display();
        }
    }
}
