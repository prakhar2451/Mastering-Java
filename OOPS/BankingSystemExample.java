public class BankingSystemExample {
    public static void main(String[] args) {
        // Creating a savings account
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 5000, 5);
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(200);
        System.out.println("Savings account balance: " + savingsAccount.getBalance());

        // Creating a current account
        CurrentAccount currentAccount = new CurrentAccount("CA456", 3000, 2000);
        currentAccount.deposit(500);
        currentAccount.withdraw(4000);
        System.out.println("Current account balance: " + currentAccount.getBalance());
    }
}
