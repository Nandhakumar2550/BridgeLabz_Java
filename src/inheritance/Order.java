package inheritance;

public class Order {
    int orderId;
    String orderDate;
}

class ShippedOrder extends Order {

    String trackingNumber;
}

class DeliveredOrder extends ShippedOrder {

    String deliveryDate;

    void getOrderStatus() {
        System.out.println("Order Delivered on " + deliveryDate);
    }
}
