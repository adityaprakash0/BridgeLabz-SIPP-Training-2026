// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Withdrawal method utilizing both custom checked and standard unchecked exceptions
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount! Withdrawal cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! You tried to withdraw " + amount + " but only have " + balance);
        }
        
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankTransactionSystem {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(5000.0);
        
        System.out.println("--- Bank Transaction System ---");
        
        // Attempt 1: Valid Withdrawal
        try {
            System.out.println("\nAttempting to withdraw 1000...");
            myAccount.withdraw(1000.0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        // Attempt 2: Negative Amount (IllegalArgumentException)
        try {
            System.out.println("\nAttempting to withdraw -500...");
            myAccount.withdraw(-500.0);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Attempt 3: Overdraft (InsufficientBalanceException)
        try {
            System.out.println("\nAttempting to withdraw 10000...");
            myAccount.withdraw(10000.0);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}