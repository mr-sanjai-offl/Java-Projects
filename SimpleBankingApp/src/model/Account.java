package model;

public class Account {
    private int accountNumber;
    private String holderName;
    private double balance;

    public Account(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0.0;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
