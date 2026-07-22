import java.util.PriorityQueue;

class Patient {
    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class HospitalERTriage {

    PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> a.priority - b.priority);

    public void admitPatient(Patient p) {
        triageQueue.offer(p);
        System.out.println(p.name + " admitted with priority " + p.priority);
    }

    public Patient callNextPatient() {
        if (triageQueue.isEmpty()) {
            System.out.println("No patients waiting.");
            return null;
        }
        return triageQueue.poll();
    }

    public Patient peekNextPatient() {
        return triageQueue.peek();
    }

    public static void main(String[] args) {
        HospitalERTriage hospital = new HospitalERTriage();

        hospital.admitPatient(new Patient(3, "Rahul"));
        hospital.admitPatient(new Patient(1, "Priya"));
        hospital.admitPatient(new Patient(4, "Amit"));
        hospital.admitPatient(new Patient(2, "Neha"));

        System.out.println("\nNext patient: "
                + hospital.peekNextPatient().name);

        System.out.println("\nServing patients:");

        while (hospital.peekNextPatient() != null) {
            Patient p = hospital.callNextPatient();
            System.out.println(p.name + " (Priority " + p.priority + ")");
        }
    }
}
