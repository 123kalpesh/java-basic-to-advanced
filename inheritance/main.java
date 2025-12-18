package inheritance;

public class Main {
    public static void main(String[] args) {
        // Test Savings Account
        SavingsAccount savings = new SavingsAccount(1000, 5.0); // 5% interest
        savings.deposit(1000);
        savings.addInterest();
        System.out.println("Savings balance: " + savings.getBalance());
        
        // Test Checking Account
        CheckingAccount checking = new CheckingAccount(200, 500); // $500 overdraft
        checking.deposit(200);
        checking.withdraw(400);  // Should work (uses overdraft)
        checking.withdraw(400);  // Should fail (exceeds overdraft)
    }
}