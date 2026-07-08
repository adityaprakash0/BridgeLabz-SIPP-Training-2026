// Superclass
abstract class Notification {
    private String recipientName;
    private String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public String getRecipientName() { return recipientName; }
    public String getMessage() { return message; }

    public abstract void sendNotification();
}

// Subclasses
class EmailNotification extends Notification {
    public EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("[EMAIL] To: " + getRecipientName() + " | Message: " + getMessage());
    }
}

class SMSNotification extends Notification {
    public SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("[SMS] To: " + getRecipientName() + " | Message: " + getMessage());
    }
}

class PushNotification extends Notification {
    public PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("[PUSH APP] To: " + getRecipientName() + " | Alert: " + getMessage());
    }
}

// Main class
public class SmartNotificationSystem {
    public static void main(String[] args) {
        // 1. Store multiple objects in array
        Notification[] notifications = {
            new EmailNotification("Alice", "Your monthly report is ready."),
            new SMSNotification("Bob", "Your OTP is 458921."),
            new PushNotification("Charlie", "New friend request received!")
        };

        System.out.println("--- Dispatching Notifications ---");
        // Dynamic Method Dispatch
        for (Notification notif : notifications) {
            notif.sendNotification(); 
        }
    }
}
