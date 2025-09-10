package Java_Constructors.level1;
public class Library_Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Library_Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.price = 0.0;
        this.isAvailable = true;
    }

    public Library_Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, the book is currently unavailable.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author +
                ", Price: ₹" + price + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        Library_Book book1 = new Library_Book("Java Essentials", "Shobhit Sharma", 499.0, true);
        Library_Book book2 = new Library_Book("OOP in Practice", "A. Kumar", 399.0, false);

        System.out.println("Book 1:");
        book1.displayDetails();
        book1.borrowBook();
        book1.displayDetails();

        System.out.println("\nBook 2:");
        book2.displayDetails();
        book2.borrowBook();
    }
}