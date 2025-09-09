package Java_Class_andObjects.level1;

public class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void showBookInfo() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 350);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 750);
        book1.showBookInfo();
        book2.showBookInfo();
    }
}