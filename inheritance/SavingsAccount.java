package inheritace;
public class SavingsAccount extends inheritace_BankAccount {
    private double interestRate;
    public SavingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }
    public void addInterest(){
        double interest = getBalance() * interestRate;
        deposit(interest);
    }package inheritance;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
    
    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Added interest: " + interest);
    }
}
    public void display(){
        System.out.println("Savings Account");
    }
}