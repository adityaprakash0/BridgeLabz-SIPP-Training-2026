// Class Definition
class Circle {
    // Private attribute for encapsulation
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and Setter
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display results
    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
        System.out.println("-------------------------");
    }
}

// Main class to test
public class CircleComputation {
    public static void main(String[] args) {
        // Create circle object with radius 5.5
        Circle circle1 = new Circle(5.5);
        circle1.displayDetails();
        
        // Update radius using setter
        circle1.setRadius(10.0);
        System.out.println("After updating radius:");
        circle1.displayDetails();
    }
}
