abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public abstract double calculateTotalPrice();

    public void displayItemDetails() {
        System.out.println("Item: " + itemName + " | Qty: " + quantity + " | Base Price: $" + price);
    }
}

class VegItem extends FoodItem {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    
    @Override 
    public double calculateTotalPrice() { 
        return getPrice() * getQuantity(); 
    }
}

class NonVegItem extends FoodItem {
    private double serviceCharge = 5.0; // Extra charge for non-veg handling

    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    
    @Override 
    public double calculateTotalPrice() { 
        return (getPrice() * getQuantity()) + serviceCharge; 
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        VegItem veg = new VegItem("Paneer Salad", 12.0, 2);
        NonVegItem nonVeg = new NonVegItem("Chicken Tikka", 15.0, 2);

        veg.displayItemDetails();
        System.out.println("Total Price: $" + veg.calculateTotalPrice() + "\n");

        nonVeg.displayItemDetails();
        System.out.println("Total Price (incl. service charge): $" + nonVeg.calculateTotalPrice());
    }
}
