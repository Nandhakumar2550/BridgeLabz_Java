package constructor.level1;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    // Copy constructor
    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {

        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Nandha", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);

        b1.display();
        System.out.println();

        b2.display();
        System.out.println();

        b3.display();
    }
}
