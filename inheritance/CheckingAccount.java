package inheritance;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;
    
    public CheckingAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            return true;
        }
        System.out.println("Withdrawal failed: Overdraft limit exceeded");
        return false;
    }
}