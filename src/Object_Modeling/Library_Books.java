package Object_Modeling;

import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(Book b) {
        books.add(b);
    }

    void showLibrary() {
        System.out.println("Library Name: " + name);
        for (Book b : books) {
            b.showBook();
            System.out.println();
        }
    }
}

public class Library_Books {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Shobhit Verma");
        Book b2 = new Book("Python Guide", "Riya Sharma");
        Book b3 = new Book("C++ Mastery", "Amit Singh");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("School Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); // same book added to another library
        lib2.addBook(b3);

        lib1.showLibrary();
        System.out.println("------------------");
        lib2.showLibrary();
    }
}