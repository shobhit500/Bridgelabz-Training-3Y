package keywords_instanceofopr.level1;

public class Book {
    // Static variable shared across all Book instances
    static String libraryName = "City Central Library";

    // Final variable to ensure ISBN cannot be changed
    private final String isbn;

    // Instance variables
    private String title;
    private String author;

    // Constructor using 'this' keyword
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details if object is instance of Book
    public void displayDetails(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ISBN: " + b.isbn);
        } else {
            System.out.println("Invalid object. Not a Book instance.");
        }
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Book.displayLibraryName();

        Book book1 = new Book("The Alchemist", "Paulo Coelho", "9780061122415");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "9780132350884");

        book1.displayDetails(book1);  // Valid
        book2.displayDetails("Not a Book");  // Invalid
    }
}