package ch.juventus.logging;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    private final BankAccount bankAccount = new BankAccount("testAccount");

    @Test
    public void testDeposit() {
        assertEquals(bankAccount.deposit(15000), 15000,0.0001);
    }
}
