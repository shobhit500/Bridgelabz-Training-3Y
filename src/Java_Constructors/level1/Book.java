package Java_Constructors.level1;

public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-----------");
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("The Silent Patient", "Alex Michaelides", 499.0);

        defaultBook.displayDetails();
        customBook.displayDetails();
    }
}