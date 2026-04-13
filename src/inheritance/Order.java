package inheritance;

// Base class representing a general order
public class Order {

    // Unique order ID
    int orderId;

    // Date when order was placed
    String orderDate;
}

// ShippedOrder class inheriting Order
class ShippedOrder extends Order {

    // Tracking number for shipped order
    String trackingNumber;
}

// DeliveredOrder class inheriting ShippedOrder
class DeliveredOrder extends ShippedOrder {

    // Date when order was delivered
    String deliveryDate;

    void getOrderStatus() {

        // Display delivery status message
        System.out.println("Order Delivered on " + deliveryDate);
    }
}