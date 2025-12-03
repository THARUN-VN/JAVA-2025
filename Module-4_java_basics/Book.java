import java.util.Scanner;

// ===================== PUBLIC BOOK CLASS (FILE NAME MATCHES) =====================
public class Book {
    private String title;
    private int price;

    public Book() {}

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book[title=" + title + ", price=" + price + "]";
    }

    // MAIN METHOD INSIDE BOOK CLASS
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ----------- BOOK INPUT -----------
        System.out.print("Enter Book Title: ");
        String bTitle = sc.nextLine();
        System.out.print("Enter Book Price: ");
        int bPrice = sc.nextInt();
        sc.nextLine();
        Book book = new Book(bTitle, bPrice);
        System.out.println(book);


        // ----------- CAR INPUT -----------
        System.out.print("Enter Car Model: ");
        String carModel = sc.nextLine();
        Car car = new Car(carModel);
        System.out.println("Runtime class of Car: " + car.getClass());


        // ----------- STUDENT INPUT -----------
        System.out.print("Enter Student Roll: ");
        int roll1 = sc.nextInt();
        System.out.print("Enter Another Student Roll: ");
        int roll2 = sc.nextInt();
        Student s1 = new Student(roll1);
        Student s2 = new Student(roll2);
        System.out.println("Students equal? " + s1.equals(s2));
        System.out.println("HashCodes: " + s1.hashCode() + ", " + s2.hashCode());

        sc.nextLine(); // clear buffer

        // ----------- MOVIE INPUT -----------
        System.out.print("Enter Movie Name: ");
        String mName = sc.nextLine();
        System.out.print("Enter Movie Rating: ");
        double mRating = sc.nextDouble();
        Movie movie = new Movie(mName, mRating);
        System.out.println(movie);


        // ----------- PLAYER INPUT -----------
        System.out.print("Enter Player Age: ");
        int pAge1 = sc.nextInt();
        System.out.print("Enter Another Player Age: ");
        int pAge2 = sc.nextInt();

        Player p1 = new Player(pAge1);
        Player p2 = new Player(pAge2);

        System.out.println("Player hash codes: " + p1.hashCode() + ", " + p2.hashCode());
    }
}


// ===================== CAR CLASS =====================
class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }
}


// ===================== STUDENT CLASS =====================
class Student {
    private int roll;

    public Student(int roll) {
        this.roll = roll;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;

        Student s = (Student) obj;
        return this.roll == s.roll;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(roll);
    }
}


// ===================== MOVIE CLASS =====================
class Movie {
    private String name;
    private double rating;

    public Movie(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie[name=" + name + ", rating=" + rating + "]";
    }
}


// ===================== PLAYER CLASS =====================
class Player {
    private int age;

    public Player(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(age);
    }
}

