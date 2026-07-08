// Interfaces
interface Trackable {
    void logActivity();
    
    // Default method (Java 8 feature)
    default void resetData() {
        System.out.println("Trackable: Resetting all fitness data to zero.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

// Class implementing multiple interfaces
class FitnessDevice implements Trackable, Reportable, Notifiable {
    private String deviceOwner;

    public FitnessDevice(String deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public String getDeviceOwner() { return deviceOwner; }

    @Override
    public void logActivity() {
        System.out.println("Logging activity for " + deviceOwner + ": 5000 steps walked.");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating Report: " + deviceOwner + " burned 300 calories today.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert! " + deviceOwner + ", you have been inactive for 2 hours. Time to move!");
    }
}

// Main class
public class FitnessTrackerSystem {
    public static void main(String[] args) {
        String userName = "Aditya";
        FitnessDevice myBand = new FitnessDevice(userName);

        System.out.println("--- Fitness Device Operations ---");
        myBand.logActivity();
        myBand.generateReport();
        myBand.sendAlert();
        
        // Calling the default method
        myBand.resetData(); 
    }
}
