public class CurrentAccount extends Account {
    private double overdraftLimit; // Encapsulation: Private field

    // Constructor
    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance); // Inheritance: Calling superclass constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Method overriding
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount); // Method overriding: Calling superclass method
        } else {
            System.out.println("Exceeded overdraft limit for account " + getAccountNumber());
        }
    }
}
