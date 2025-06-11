public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount, String message) {
        if (amount > balance) {
            System.out.println("Insufficient funds. " + message);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " - " + message);
        }
    }
    public void withdraw(double amount) {
        System.out.println("Successful!");
    }
    public void checkBalance() {
        System.out.println("Account Balance: " + balance);
    }
    public string getAccountNumber() {
        return accountNumber;
    }
}