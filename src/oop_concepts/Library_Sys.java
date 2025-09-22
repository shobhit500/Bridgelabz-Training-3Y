package oop_concepts;

import java.util.*;

// Interface
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract Class
abstract class LibraryItem implements Reservable {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved;
    private String borrowerName;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrowerName = "";
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Reserved: " + (isReserved ? "Yes" : "No"));
        if (isReserved) {
            System.out.println("Borrower: " + borrowerName);
        }
    }

    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            this.borrowerName = borrowerName;
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }

    public abstract int getLoanDuration(); // in days
}

// Book Class
class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14; // 2 weeks
    }
}

// Magazine Class
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7; // 1 week
    }
}

// DVD Class
class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 3; // 3 days
    }
}

// Main Class
public class Library_Sys{
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("B001", "Java Basics", "Shobhit"));
        items.add(new Magazine("M001", "Tech Today", "Editor Team"));
        items.add(new DVD("D001", "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item.checkAvailability()) {
                item.reserveItem("Student A");
                System.out.println("Item reserved successfully.");
            } else {
                System.out.println("Item is already reserved.");
            }

            System.out.println("---------------------------");
        }
    }
}