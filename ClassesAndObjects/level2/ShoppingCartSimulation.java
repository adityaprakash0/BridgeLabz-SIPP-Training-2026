// Class Definition
class CartItem {
    // Private attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Method to add items (increase quantity)
    public void addItem(int amount) {
        if (amount > 0) {
            this.quantity += amount;
            System.out.println("Added " + amount + " " + itemName + "(s) to the cart.");
        }
    }

    // Method to remove items (decrease quantity)
    public void removeItem(int amount) {
        if (amount > 0 && amount <= this.quantity) {
            this.quantity -= amount;
            System.out.println("Removed " + amount + " " + itemName + "(s) from the cart.");
        } else {
            System.out.println("Cannot remove " + amount + " items. Current quantity: " + this.quantity);
        }
    }

    // Method to display total cost for this item
    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Cart Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + price);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("-------------------------");
    }
}

// Main class to test
public class ShoppingCartSimulation {
    public static void main(String[] args) {
        // Initialize an item in the cart
        CartItem item = new CartItem("Wireless Mouse", 25.50, 1);
        item.displayTotalCost();

        // Add more of the same item
        item.addItem(2);
        item.displayTotalCost();

        // Remove an item
        item.removeItem(1);
        item.displayTotalCost();
    }
}
