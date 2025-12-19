package inheritance;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate / 100; // Convert percentage to decimal
    }
    
    @Override
    public void display() {
        System.out.println("Savings Account");
    }
    
    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Added interest: " + interest);
    }
}