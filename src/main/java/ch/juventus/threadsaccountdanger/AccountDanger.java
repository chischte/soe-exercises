package ch.juventus.threadsaccountdanger;

public class AccountDanger implements Runnable {

    private Account account = new Account(1111);

    @Override
    public void run() {
        for (int x = 0; x < 2; x++) {
            makeWithdrawal(777);
        }
    }

    private void makeWithdrawal(int amount) {
        synchronized (account) {
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + " attempts to withdraw");
                System.out.println("Balance before withdrawal: " + account.getBalance());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.withdraw(amount);
                System.out.print(Thread.currentThread().getName() + " withdrew " + amount + " ");
                System.out.println(" Balance after withdrawal: " + account.getBalance());
            } else {
                System.out.print("Account balance is: " + account.getBalance() + "Not enough for ");
                System.out.println(Thread.currentThread().getName() +
                        " to withdraw " + amount);
            }

        }
    }


}