class BankAccount {
    // Encapsulated data members
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setter for balance with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    // Method to be overridden
    public double calculateInterest() {
        return 0;
    }
}

// Savings account subclass
class Savings extends BankAccount {
    public Savings(String accountHolder, int accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }
}

// Current account subclass
class Current extends BankAccount {
    public Current(String accountHolder, int accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new Savings("Aman", 101, 5000);
        BankAccount acc2 = new Current("Riya", 102, 8000);

        System.out.println("Savings Account Interest: " + acc1.calculateInterest());
        System.out.println("Current Account Interest: " + acc2.calculateInterest());
    }
}