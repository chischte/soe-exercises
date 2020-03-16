package ch.juventus.logging;

public class Main {
    public static void main(final String[] args) {
        BankAccount michiAccount = new BankAccount("Michikonto");
        michiAccount.deposit(15000);
        michiAccount.withdraw(6000);
        System.out.println("OK: " + michiAccount.viewBalance());
    }
}
