public class multinheritance{
    public static void main(String[] args) {
        Puppy p = new Puppy("Buddy", 3);
        System.out.println();
        p.eat();            // from Animal
        p.bark();           // from Dog
        p.play();           // from Playful
        p.train();          // from Trainable
        System.out.println("Puppy details: name=" + p.getName() + ", age=" + p.getAge());
    }
}

// Base class
class Animal {
    private String name;
    private int age;

    public Animal() {
        this("Unnamed", 0);
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructed: " + name + ", age " + age);
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Subclass of Animal
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
        System.out.println("Dog constructed: " + name);
    }

    public void bark() {
        System.out.println(getName() + " says: Woof!");
    }
}

// Interfaces to demonstrate multiple inheritance via interfaces
interface Playful {
    void play();
}

interface Trainable {
    void train();
}

// Puppy extends Dog (single inheritance) and implements Playful & Trainable (multiple inheritance via interfaces)
class Puppy extends Dog implements Playful, Trainable {
    public Puppy(String name, int age) {
        super(name, age);
        System.out.println("Puppy constructed: " + name + " (age " + age + ")");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing happily.");
    }

    @Override
    public void train() {
        System.out.println(getName() + " is training: sits, stays, fetches.");
    }
}