abstract class Subscription {
    private String subscriberName;
    private String subscriptionId;

    public Subscription(String subscriberName, String subscriptionId) {
        this.subscriberName = subscriberName;
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriberName() { return subscriberName; }
    public String getSubscriptionId() { return subscriptionId; }

    public abstract double calculateMonthlyCharge();
}

class BasicPlan extends Subscription {
    public BasicPlan(String name, String id) { super(name, id); }
    @Override public double calculateMonthlyCharge() { return 9.99; }
}

class PremiumPlan extends Subscription {
    public PremiumPlan(String name, String id) { super(name, id); }
    @Override public double calculateMonthlyCharge() { return 19.99; }
}

class FamilyPlan extends Subscription {
    public FamilyPlan(String name, String id) { super(name, id); }
    @Override public double calculateMonthlyCharge() { return 29.99; }
}

public class SubscriptionAnalyzer {

    public static void searchById(Subscription[] subs, String id) {
        for (Subscription sub : subs) {
            if (sub.getSubscriptionId().equals(id)) {
                System.out.println("Found: " + sub.getSubscriberName() + " | Plan: " + sub.getClass().getSimpleName());
                return;
            }
        }
        System.out.println("ID not found.");
    }

    public static void displayByStartingLetter(Subscription[] subs, char letter) {
        System.out.println("Subscribers starting with '" + letter + "':");
        for (Subscription sub : subs) {
            if (sub.getSubscriberName().toLowerCase().charAt(0) == Character.toLowerCase(letter)) {
                System.out.println("- " + sub.getSubscriberName());
            }
        }
    }

    public static double calculateTotalRevenue(Subscription[] subs) {
        double total = 0;
        for (Subscription sub : subs) total += sub.calculateMonthlyCharge();
        return total;
    }

    public static void identifyMostExpensive(Subscription[] subs) {
        Subscription expensive = subs[0];
        for (Subscription sub : subs) {
            if (sub.calculateMonthlyCharge() > expensive.calculateMonthlyCharge()) {
                expensive = sub;
            }
        }
        System.out.println("Most Expensive Sub: " + expensive.getSubscriberName() + " paying $" + expensive.calculateMonthlyCharge());
    }

    public static void main(String[] args) {
        Subscription[] users = {
            new BasicPlan("Alice", "SUB001"),
            new PremiumPlan("Bob", "SUB002"),
            new FamilyPlan("Charlie", "SUB003"),
            new BasicPlan("Arthur", "SUB004")
        };

        System.out.println("Total Monthly Revenue: $" + calculateTotalRevenue(users));
        identifyMostExpensive(users);
        searchById(users, "SUB002");
        displayByStartingLetter(users, 'A');
    }
}
