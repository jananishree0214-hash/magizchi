package junit.demo;

public class BankAccount {

    private double balance;

   
    public BankAccount(int balance) {
        this.balance = balance;
    }

    
    public void deposit(int amount) {
        balance = balance + amount;
    }

   
    public void withdraw(int amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient Balance");
        }
        balance = balance - amount;
    }

    
    public double getBalance() {
        return balance;
    }
}