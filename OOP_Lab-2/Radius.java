import java.util.*;

public class Radius {
    double radius;
    void area() {
        double a = 3.1416 * radius * radius;
        System.out.println("Area: " + a);
    }

    void perimeter() {
        double p = 2 * 3.1416 * radius;
        System.out.println("Perimeter: " + p);
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Radius c = new Radius();
        System.out.println("Enter Radius: ");
        c.radius = input.nextDouble();
        c.area();
        c.perimeter();
        c.display();
    }
}
