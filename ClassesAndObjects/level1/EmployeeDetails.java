// Class Definition
class Employee {
    // Private attributes for encapsulation
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize Employee object
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter methods
    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }

    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public void setSalary(double salary) { this.salary = salary; }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("-------------------------");
    }
}

// Main class to test
public class EmployeeDetails {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee("Alice Smith", 101, 75000.50);
        Employee emp2 = new Employee("Bob Johnson", 102, 68000.00);

        // Displaying details
        System.out.println("Employee Details:");
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
