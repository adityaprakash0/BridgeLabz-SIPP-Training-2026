interface HeartRateMonitor {
    void checkHeartRate(int bpm);
    
    default void displayHealthTips() {
        System.out.println("Tip: Normal resting heart rate is 60-100 BPM. Do cardio!");
    }
}

interface TemperatureMonitor {
    void checkTemperature(double fahrenheit);
    
    default void displayHealthTips() {
        System.out.println("Tip: Normal body temperature is around 98.6°F. Stay hydrated!");
    }
    
    static boolean isPatientIdValid(String patientId) {
        return patientId != null && patientId.startsWith("PID-");
    }
}

class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {

    @Override
    public void checkHeartRate(int bpm) {
        System.out.print("Heart Rate: " + bpm + " BPM - ");
        if (bpm < 60 || bpm > 100) System.out.println("ALERT (Abnormal)");
        else System.out.println("NORMAL");
    }

    @Override
    public void checkTemperature(double fahrenheit) {
        System.out.print("Temperature: " + fahrenheit + " °F - ");
        if (fahrenheit > 99.5) System.out.println("FEVER DETECTED");
        else System.out.println("NORMAL");
    }

    @Override
    public void displayHealthTips() {
        System.out.println("--- Hospital General Health Guidelines ---");
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }
    
    public void generateFinalReport(String name, String id, int bpm, double temp) {
        System.out.println("\nGenerating Report for: " + name);
        if (TemperatureMonitor.isPatientIdValid(id)) {
            System.out.println("Patient ID: " + id + " [VERIFIED]");
            checkHeartRate(bpm);
            checkTemperature(temp);
        } else {
            System.out.println("Patient ID: " + id + " [INVALID RECORD] - Cannot process data.");
        }
    }
}

public class HealthMonitoringApp {
    public static void main(String[] args) {
        String[] patientNames = {"John Doe", "Jane Smith", "Bob Error"};
        String[] patientIds = {"PID-101", "PID-102", "103"}; // Bob has invalid ID
        int[] heartRates = {75, 110, 80};
        double[] temps = {98.4, 101.2, 98.6};

        HealthMonitoringSystem icuSystem = new HealthMonitoringSystem();
        icuSystem.displayHealthTips();

        for (int i = 0; i < patientNames.length; i++) {
            icuSystem.generateFinalReport(patientNames[i], patientIds[i], heartRates[i], temps[i]);
        }
    }
}
