package ChapterEight.BankAndAccountTest;

import ChapterEight.BankApp.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account paulineAccount;

    @BeforeEach
    public void startWithThis() {
        paulineAccount = new Account(1234, "Zainab", "1234");
    }


    @Test
    public void depositMoneyTest() {
        //Given I have an Account
        //When I deposit 2000
        paulineAccount.deposit(BigDecimal.valueOf(2_000));
        //Check that I have 2000 balance
        assertEquals(BigDecimal.valueOf(2_000), paulineAccount.getBalance("1234"));
    }

    @Test
    public void getBalanceWithCorrectPinTest() {
        //When I deposit 2000
        paulineAccount.deposit(BigDecimal.valueOf(2_000));
        //Check that I have 2000 balance
        assertEquals(BigDecimal.valueOf(2_000), paulineAccount.getBalance("1234"));
    }


    @Test
    public void getBalanceWithWrongPinThrowsExceptionTest() {
        paulineAccount.deposit(BigDecimal.valueOf(2_000));
        //When I deposit 2000
        assertThrows(IllegalArgumentException.class, ()-> paulineAccount.getBalance("2231"));
        //Check that I have 2000 balance
    }

    @Test
    public void withdrawMoneyTest() {
        //Given that I have an account
        //When I withdraw money
        paulineAccount.deposit(BigDecimal.valueOf(3_000));
        paulineAccount.withdraw(BigDecimal.valueOf(1_000), "1234");
        assertEquals(BigDecimal.valueOf(2_000), paulineAccount.getBalance("1234"));
    }

    //@Test
    //public void customerWithdrawMoreThanBalance() {
    //    paulineAccount.deposit(BigDecimal.valueOf(1_000));
    //    paulineAccount.withdraw(BigDecimal.valueOf(3_000));
    //    assertEquals(BigDecimal.valueOf(1_000), paulineAccount.getBalance("1234"));
    //}

    @Test
    public void WithdrawWithRightPinWorksTest() {

    }

    @Test
    public void WithdrawWithWrongPinThrowsExceptionTest() {

    }

    @Test
    public void proofMichaelWrongTest() {
        System.out.println(paulineAccount);

    }
}