abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Acc No: " + accountNumber + " | Holder: " + holderName + " | Balance: $" + balance);
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accNo, String name, double balance, double interestRate) {
        super(accNo, name, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }
}

class CurrentAccount extends BankAccount {
    private double monthlyBonusRate;

    public CurrentAccount(String accNo, String name, double balance, double monthlyBonusRate) {
        super(accNo, name, balance);
        this.monthlyBonusRate = monthlyBonusRate;
    }

    public double getMonthlyBonusRate() { return monthlyBonusRate; }
    public void setMonthlyBonusRate(double monthlyBonusRate) { this.monthlyBonusRate = monthlyBonusRate; }

    @Override
    public double calculateInterest() {
        return getBalance() * (monthlyBonusRate / 100);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA-101", "John", 1000.0, 5.0);
        CurrentAccount ca = new CurrentAccount("CA-201", "Acme Corp", 5000.0, 2.0);

        sa.displayAccountDetails();
        sa.deposit(500);
        sa.withdraw(200);
        sa.displayAccountDetails();
        System.out.println("Savings Interest: $" + sa.calculateInterest());

        System.out.println("---");
        
        ca.displayAccountDetails();
        ca.deposit(1000);
        ca.displayAccountDetails();
        System.out.println("Current Bonus Interest: $" + ca.calculateInterest());
    }
}
