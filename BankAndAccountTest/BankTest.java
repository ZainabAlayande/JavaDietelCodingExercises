package ChapterEight.BankAndAccountTest;

import ChapterEight.BankApp.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank wemaBank;

    @BeforeEach
    public void startEachTestWith() {
        wemaBank = new Bank();
        wemaBank.createAccountFor("Pauline", "Obibia", "1232");
    }

    @Test
    public void accountCanBeCreatedInTheBankTest() {
        assertEquals(1, wemaBank.getNumberOfCustomers());
    }

    @Test
    public void accountCanBeFoundAfterCreation() {
        String expected = """
                =======================
                Account Name: Pauline Obibia
                Account Number: 1
                Account Balance: 0
                =======================""";
        assertEquals(expected, wemaBank.findAccount(1).toString());
    }

    @Test
    public void balanceCanBeCheckedTest() {
        assertEquals("0", wemaBank.checkBalanceFor(1, "1232").toPlainString());
    }

    @Test
    public void depositIntoAccountTest() {
        wemaBank.depositInto(1, BigDecimal.valueOf(1200));
        assertEquals(BigDecimal.valueOf(1200), wemaBank.checkBalanceFor(1, "1232"));
    }

    @Test
    public void withdrawFromAccountTest() {
        wemaBank.depositInto(1, BigDecimal.valueOf(50));
        wemaBank.withdrawFrom(1, BigDecimal.valueOf(20), "1232");
        assertEquals(BigDecimal.valueOf(30), wemaBank.checkBalanceFor(1, "1232"));
    }

    @Test
    public void transferMoneyTest() {
        wemaBank.createAccountFor("Well", "All", "1232");
        wemaBank.depositInto(2, BigDecimal.valueOf(5000));
        wemaBank.transfer(BigDecimal.valueOf(2000), 2, 1, "1232");
        assertEquals(BigDecimal.valueOf(2000), wemaBank.checkBalanceFor(1, "1232"));
        assertEquals(BigDecimal.valueOf(3000), wemaBank.checkBalanceFor(2, "1232"));
    }
}