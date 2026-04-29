class BankAccount<T extends Number> {
    private double balance;

    // Constructor
    public BankAccount(T initialBalance) {
        this.balance = initialBalance.doubleValue();
    }

    // Deposit method
    public void deposit(T amount) {
        balance += amount.doubleValue();
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
public class Balance{
    public static void main(String[] args) {
        System.out.println("alisha , 590013908");

        // Integer account
        BankAccount<Integer> acc1 = new BankAccount<>(1000);
        acc1.deposit(500);
        acc1.displayBalance();

        // Double account
        BankAccount<Double> acc2 = new BankAccount<>(1500.75);
        acc2.deposit(499.25);
        acc2.displayBalance();
    }
}