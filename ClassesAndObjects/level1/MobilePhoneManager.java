// Class Definition
class MobilePhone {
    // Private attributes
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters and Setters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getPrice() { return price; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setPrice(double price) { this.price = price; }

    // Method to display mobile details
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("-------------------------");
    }
}

// Main class to test
public class MobilePhoneManager {
    public static void main(String[] args) {
        // Create MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 999.99);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 899.50);

        // Display details
        phone1.displayDetails();
        phone2.displayDetails();
    }
}
