package classandobject.level2;

public class MovieTicket {

    // Name of the movie
    String movieName;

    // Seat number assigned to ticket
    String seatNumber;

    // Price of the ticket
    double price;

    void bookTicket(String seat, double ticketPrice) {

        // Assign seat number to ticket
        seatNumber = seat;

        // Assign ticket price
        price = ticketPrice;

        // Confirmation message after booking
        System.out.println("Ticket Booked Successfully!");
    }

    void displayDetails() {

        // Display movie name
        System.out.println("Movie: " + movieName);

        // Display seat number
        System.out.println("Seat: " + seatNumber);

        // Display ticket price
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        // Create MovieTicket object
        MovieTicket ticket = new MovieTicket();

        // Set movie name
        ticket.movieName = "Avengers";

        // Book ticket with seat and price
        ticket.bookTicket("A12", 250);

        // Display ticket details
        ticket.displayDetails();
    }
}