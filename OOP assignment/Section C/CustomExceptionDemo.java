class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal failed: Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);
        }
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Aman", 5000);

        try {
            acc.withdraw(2000);
            acc.withdraw(4000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}