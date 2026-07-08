interface LuggageScanner {
    boolean scanLuggage(int weight);
    
    default void displaySecurityGuidelines() {
        System.out.println("Luggage Guideline: Max weight 20kg. No sharp objects.");
    }
}

interface PassportVerifier {
    boolean verifyPassport(String passportNo);
    
    default void displaySecurityGuidelines() {
        System.out.println("Passport Guideline: Must be valid for 6 months and physically present.");
    }
    
    static boolean isPassportNumberValid(String passportNo) {
        // Simple mock validation (e.g., must be 8 alphanumeric chars)
        return passportNo != null && passportNo.length() == 8;
    }
}

class AirportSecuritySystem implements LuggageScanner, PassportVerifier {

    private int maxAllowedWeight = 20;

    @Override
    public boolean scanLuggage(int weight) {
        return weight <= maxAllowedWeight;
    }

    @Override
    public boolean verifyPassport(String passportNo) {
        return PassportVerifier.isPassportNumberValid(passportNo);
    }

    @Override
    public void displaySecurityGuidelines() {
        System.out.println("--- Central Airport Security Guidelines ---");
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }

    public void processPassenger(String name, String passport, int luggageWeight) {
        System.out.println("\nProcessing Passenger: " + name);
        boolean isLuggageOk = scanLuggage(luggageWeight);
        boolean isPassportOk = verifyPassport(passport);
        
        if (isLuggageOk && isPassportOk) {
            System.out.println("Status: CLEARED FOR BOARDING");
        } else {
            System.out.println("Status: DENIED BOARDING");
            if (!isLuggageOk) System.out.println("- Reason: Overweight luggage (" + luggageWeight + "kg)");
            if (!isPassportOk) System.out.println("- Reason: Invalid passport format");
        }
    }
}

public class AirportSecuritySystemMain {
    public static void main(String[] args) {
        String[] passengerNames = {"Aditya", "Rahul", "Priya"};
        String[] passports = {"A1234567", "INVALID", "B9876543"};
        int[] luggageWeights = {15, 10, 25}; // Priya is overweight
        
        AirportSecuritySystem terminal1 = new AirportSecuritySystem();
        terminal1.displaySecurityGuidelines();
        
        for (int i = 0; i < passengerNames.length; i++) {
            terminal1.processPassenger(passengerNames[i], passports[i], luggageWeights[i]);
        }
    }
}
