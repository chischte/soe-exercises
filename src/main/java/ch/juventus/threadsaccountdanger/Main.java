package ch.juventus.threadsaccountdanger;

public class Main {
    public static void main(String[] args) {
        AccountDanger sharedAccountDanger = new AccountDanger();
        Thread bobsAccess = new Thread(sharedAccountDanger);
        Thread babettesAccess = new Thread(sharedAccountDanger);
        Thread three = new Thread(sharedAccountDanger);
        bobsAccess.setName("Bob");
        babettesAccess.setName("Babette");
        bobsAccess.start();
        babettesAccess.start();
    }

}
