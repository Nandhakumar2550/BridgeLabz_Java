package constructor.level1;

public class HotelBooking {

    // Guest name
    String guestName;

    // Type of room booked
    String roomType;

    // Number of nights stayed
    int nights;

    // Default constructor
    HotelBooking() {

        // Assign default values
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String g, String r, int n) {

        // Assign values passed during object creation
        guestName = g;
        roomType = r;
        nights = n;
    }

    // Copy constructor
    HotelBooking(HotelBooking h) {

        // Copy values from another object
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    void display() {

        // Display guest name
        System.out.println("Guest Name: " + guestName);

        // Display room type
        System.out.println("Room Type: " + roomType);

        // Display number of nights
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {

        // Create object using default constructor
        HotelBooking b1 = new HotelBooking();

        // Create object using parameterized constructor
        HotelBooking b2 = new HotelBooking("Nandha", "Deluxe", 3);

        // Create object using copy constructor
        HotelBooking b3 = new HotelBooking(b2);

        // Display first booking details
        b1.display();
        System.out.println();

        // Display second booking details
        b2.display();
        System.out.println();

        // Display copied booking details
        b3.display();
    }
}