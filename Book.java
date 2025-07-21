// Book.java
public class Book {
    String title;
    String author;
    double price;

    // Constructor with all three parameters
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Constructor with only title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 100; // default price
    }

    // Method to display book information
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Smith", 150);
        Book b2 = new Book("OOP Concepts", "Jane Doe");

        b1.displayInfo();
        System.out.println("---");
        b2.displayInfo();
    }
}
