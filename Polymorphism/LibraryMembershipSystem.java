// Superclass
abstract class LibraryMember {
    private String memberName;
    private String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public String getMemberName() { return memberName; }
    public String getMemberId() { return memberId; }

    public abstract double calculateFine(int overdueDays);
    
    public void printDetails() {
        System.out.println("ID: " + memberId + " | Name: " + memberName);
    }
}

// Subclasses
class StudentMember extends LibraryMember {
    private double dailyFineRate = 1.5; // Low fine for students

    public StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * dailyFineRate;
    }
}

class FacultyMember extends LibraryMember {
    private double dailyFineRate = 0.5; // Minimal fine for faculty

    public FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * dailyFineRate;
    }
}

class GuestMember extends LibraryMember {
    private double dailyFineRate = 5.0; // High fine for guests

    public GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * dailyFineRate;
    }
}

// Main class
public class LibraryMembershipSystem {

    public static void findMember(LibraryMember[] members, String targetId) {
        boolean found = false;
        for (LibraryMember member : members) {
            if (member.getMemberId().equals(targetId)) {
                System.out.println("\n--- Member Found ---");
                member.printDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nMember with ID " + targetId + " not found.");
        }
    }

    public static void main(String[] args) {
        LibraryMember[] members = {
            new StudentMember("Aditya", "STU101"),
            new FacultyMember("Dr. Smith", "FAC201"),
            new GuestMember("John Doe", "GST301")
        };

        int overdueDays = 5;
        System.out.println("--- Library Members & Fines (" + overdueDays + " days overdue) ---");
        
        for (LibraryMember member : members) {
            member.printDetails();
            System.out.println("Calculated Fine: $" + member.calculateFine(overdueDays));
            System.out.println("-");
        }

        // Search functionality
        String searchId = "FAC201";
        findMember(members, searchId);
    }
}
