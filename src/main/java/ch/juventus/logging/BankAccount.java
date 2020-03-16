package main.java.ch.juventus.logging;

public class BankAccount {
    private double balance;
    private String accountOwner;

    public BankAccount(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void viewBalance() {
        System.out.println(balance);
    }

}
