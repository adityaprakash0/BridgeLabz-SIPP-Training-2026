// Class Definition
class Student {
    // Private attributes
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getters and Setters
    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }
    public double getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }
    public void setMarks(double marks) { this.marks = marks; }

    // Method to calculate grade
    public char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    // Method to display details and grade
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("-------------------------");
    }
}

// Main class to test
public class StudentReportSimulation {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student("Aditya", 1, 95.5);
        Student student2 = new Student("Rahul", 2, 72.0);

        // Display reports
        System.out.println("Student Reports:");
        student1.displayDetails();
        student2.displayDetails();
    }
}
