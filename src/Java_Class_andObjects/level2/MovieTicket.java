package Java_Class_andObjects.level2;
public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    MovieTicket() {
        this.movieName = "";
        this.seatNumber = "";
        this.price = 0.0;
    }

    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully.");
    }

    public void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket();
        MovieTicket ticket2 = new MovieTicket();

        ticket1.bookTicket("Inception", "A12", 250.0);
        ticket2.bookTicket("Interstellar", "B7", 300.0);

        ticket1.displayTicket();
        ticket2.displayTicket();
    }
}