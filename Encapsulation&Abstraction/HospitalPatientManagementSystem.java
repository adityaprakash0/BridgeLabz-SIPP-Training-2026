abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public abstract double calculateBill();

    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId + " | Name: " + name + " | Age: " + age);
    }
}

class InPatient extends Patient {
    private double roomCharges;
    private double treatmentCharges;

    public InPatient(String id, String name, int age, double room, double treatment) {
        super(id, name, age);
        this.roomCharges = room;
        this.treatmentCharges = treatment;
    }

    public double getRoomCharges() { return roomCharges; }
    public void setRoomCharges(double roomCharges) { this.roomCharges = roomCharges; }
    public double getTreatmentCharges() { return treatmentCharges; }
    public void setTreatmentCharges(double treatmentCharges) { this.treatmentCharges = treatmentCharges; }

    @Override
    public double calculateBill() {
        return roomCharges + treatmentCharges;
    }
}

class OutPatient extends Patient {
    private double consultationFees;
    private double treatmentCharges;

    public OutPatient(String id, String name, int age, double consultation, double treatment) {
        super(id, name, age);
        this.consultationFees = consultation;
        this.treatmentCharges = treatment;
    }

    public double getConsultationFees() { return consultationFees; }
    public void setConsultationFees(double consultationFees) { this.consultationFees = consultationFees; }
    public double getTreatmentCharges() { return treatmentCharges; }
    public void setTreatmentCharges(double treatmentCharges) { this.treatmentCharges = treatmentCharges; }

    @Override
    public double calculateBill() {
        return consultationFees + treatmentCharges;
    }
}

public class HospitalPatientManagementSystem {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient("IP-001", "Emma", 45, 1000.0, 2500.0);
        OutPatient outPatient = new OutPatient("OP-002", "Liam", 30, 200.0, 150.0);

        inPatient.displayPatientDetails();
        System.out.println("Total Bill: $" + inPatient.calculateBill() + "\n");

        outPatient.displayPatientDetails();
        System.out.println("Total Bill: $" + outPatient.calculateBill());
    }
}
