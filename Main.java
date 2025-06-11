import banking.BankAccount;
public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("102310240", 600);

        myAccount.deposit(1000);
        myAccount.withdraw(400);
        myAccount.withdraw(2000, "Attempting to withdraw more than available!");
        myAccount.checkBalance();

    }
}