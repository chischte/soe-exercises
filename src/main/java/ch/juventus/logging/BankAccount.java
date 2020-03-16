package ch.juventus.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

    final Logger logger = LoggerFactory.getLogger(BankAccount.class);



    private double balance;
    private String accountOwner;

    public BankAccount(String accountOwner) {
        this.accountOwner = accountOwner;
        logger.debug("Account created {}",accountOwner);
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
