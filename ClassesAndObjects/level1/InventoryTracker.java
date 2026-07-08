// Class Definition
class Item {
    // Private attributes
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Getters and Setters
    public int getItemCode() { return itemCode; }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    
    public void setItemCode(int itemCode) { this.itemCode = itemCode; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setPrice(double price) { this.price = price; }

    // Method to calculate total cost
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: $" + price);
    }
}

// Main class to test
public class InventoryTracker {
    public static void main(String[] args) {
        // Create an Item object
        Item laptop = new Item(1001, "Gaming Laptop", 1200.00);
        
        System.out.println("Inventory Details:");
        laptop.displayDetails();
        
        // Calculate cost for a specific quantity
        int quantity = 3;
        double totalCost = laptop.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: $" + totalCost);
    }
}
