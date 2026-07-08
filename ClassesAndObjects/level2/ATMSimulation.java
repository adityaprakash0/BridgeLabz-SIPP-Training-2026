// Class Definition
class BankAccount {
    // Private attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getters and Setters
    public String getAccountHolder() { return accountHolder; }
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ". Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
        System.out.println("-------------------------");
    }
}

// Main class to test
public class ATMSimulation {
    public static void main(String[] args) {
        // Initialize account
        BankAccount myAccount = new BankAccount("Aditya Prakash", "AC123456789", 1000.00);

        System.out.println("Welcome to the ATM Simulation!");
        myAccount.displayBalance();

        // Perform operations
        myAccount.deposit(500.00);
        myAccount.withdraw(200.00);
        myAccount.withdraw(2000.00); // Should fail
        myAccount.displayBalance();
    }
}
