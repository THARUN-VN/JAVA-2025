public class Book {

    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
        System.out.println("Default Constructor:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0; 
        System.out.println("Constructor with Title & Author:");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println();
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Constructor with All Fields:");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println();
    }

    public static void main(String[] args) {

        Book b1 = new Book();

        Book b2 = new Book("Harry Potter", "J.K. Rowling");

        Book b3 = new Book("The Alchemist", "Paulo Coelho", 399.99);
    }
}

