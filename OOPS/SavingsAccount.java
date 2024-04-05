public class SavingsAccount extends Account {
    private double interestRate; // Encapsulation: Private field

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Inheritance: Calling superclass constructor
        this.interestRate = interestRate;
    }

    // Method overriding
    @Override
    public void deposit(double amount) {
        super.deposit(amount); // Method overriding: Calling superclass method
        applyInterest();
    }

    // Helper method to apply interest
    private void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        super.deposit(interest); // Method overriding: Calling superclass method
        System.out.println("Interest applied: " + interest);
    }
}
