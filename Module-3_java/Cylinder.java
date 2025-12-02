public class Cylinder {

    private double radius;
    private double height;
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public Cylinder() {}
}


class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        this.length = 4;
        this.breadth = 5;
        System.out.println("Default Rectangle (4x5) created.");
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Custom Rectangle (" + length + "x" + breadth + ") created.");
    }
}

class CylinderDemo {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        c1.setRadius(5);
        c1.setHeight(10);

        System.out.println("Using Getters & Setters:");
        System.out.println("Surface Area: " + c1.surfaceArea());
        System.out.println("Volume: " + c1.volume());
        System.out.println();

        Cylinder c2 = new Cylinder(7, 14);

        System.out.println("Using Constructor:");
        System.out.println("Surface Area: " + c2.surfaceArea());
        System.out.println("Volume: " + c2.volume());
        System.out.println();

  
        Rectangle r1 = new Rectangle(); // default 4x5
        Rectangle r2 = new Rectangle(10, 20); // custom
    }
}


