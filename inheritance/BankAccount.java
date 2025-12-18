// Inheritance :- Inheritance is a mechanism in which one class 
//              acquires the properties and behaviors of another class. 


//create a class rectangle and use inheritace to create a class square

//Bank Account System
//Create a BankAccount class with methods for deposit() and withdraw()
//Create SavingsAccount and CheckingAccount classes with their own interest rates and withdrawal rules
package inheritace;
public class BankAccount {
    protected double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void display(){
        System.out.println("Bank Account");
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit");
        }
    }
    public boolean withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw");
            return true;
        }
        System.out.println("Withdraw");
        return false;
    }
    public double getBalance(){
        return balance;
    }
    
}