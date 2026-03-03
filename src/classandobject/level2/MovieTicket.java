package classandobject.level2;

public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String seat, double ticketPrice) {
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket Booked Successfully!");
    }

    void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.movieName = "Avengers";

        ticket.bookTicket("A12", 250);
        ticket.displayDetails();
    }
}
