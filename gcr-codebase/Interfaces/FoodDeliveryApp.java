interface FoodDelivery {
    void deliverFood(String customerName);
    
    default void trackOrder() {
        System.out.println("Tracking: Food order is out for delivery from Restaurant.");
    }
    
    static String generateDeliveryCode() {
        return "DEL-" + (int)(Math.random() * 9000 + 1000); // E.g., DEL-4582
    }
}

interface GroceryDelivery {
    void deliverGrocery(String customerName);
    
    default void trackOrder() {
        System.out.println("Tracking: Grocery order is packed and dispatched from Supermart.");
    }
}

class DeliveryExecutive implements FoodDelivery, GroceryDelivery {
    private String executiveName;

    public DeliveryExecutive(String executiveName) {
        this.executiveName = executiveName;
    }

    @Override
    public void deliverFood(String customerName) {
        String code = FoodDelivery.generateDeliveryCode();
        System.out.println("[" + executiveName + "] delivering HOT FOOD to " + customerName + " (Code: " + code + ")");
    }

    @Override
    public void deliverGrocery(String customerName) {
        String code = FoodDelivery.generateDeliveryCode();
        System.out.println("[" + executiveName + "] delivering GROCERIES to " + customerName + " (Code: " + code + ")");
    }

    @Override
    public void trackOrder() {
        System.out.println("--- Live Tracking Update ---");
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }
    
    public void processAllDeliveries(String[] foodCustomers, String[] groceryCustomers) {
        trackOrder(); // Resolving conflict demo
        System.out.println("\n--- Initiating Deliveries ---");
        for (String customer : foodCustomers) {
            deliverFood(customer);
        }
        for (String customer : groceryCustomers) {
            deliverGrocery(customer);
        }
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {
        String[] foodOrders = {"Alice", "Bob"};
        String[] groceryOrders = {"Charlie", "David"};

        DeliveryExecutive rider = new DeliveryExecutive("Ramesh");
        rider.processAllDeliveries(foodOrders, groceryOrders);
    }
}
