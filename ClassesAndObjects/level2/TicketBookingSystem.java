// Class Definition
class MovieTicket {
    // Private attributes
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor initializes unbooked ticket
    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false;
        this.seatNumber = "Not Assigned";
    }

    // Getters and Setters
    public String getMovieName() { return movieName; }
    public String getSeatNumber() { return seatNumber; }
    public double getPrice() { return price; }
    public boolean getIsBooked() { return isBooked; }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double dynamicPrice) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = dynamicPrice; // Update price (e.g., premium seating)
            this.isBooked = true;
            System.out.println("Ticket booked successfully for seat: " + seatNumber);
        } else {
            System.out.println("Sorry, this ticket is already booked.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
        System.out.println("Status: " + (isBooked ? "Booked" : "Available"));
        System.out.println("-------------------------");
    }
}

// Main class to test
public class TicketBookingSystem {
    public static void main(String[] args) {
        // Create an available ticket
        MovieTicket ticket = new MovieTicket("Inception", 12.00);
        
        System.out.println("Before Booking:");
        ticket.displayTicketDetails();

        // Book the ticket
        System.out.println("Action: Booking ticket...");
        ticket.bookTicket("A-12", 15.00);
        
        System.out.println("\nAfter Booking:");
        ticket.displayTicketDetails();
    }
}
