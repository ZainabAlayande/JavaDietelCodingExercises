package ChapterEight.BankApp;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance = BigDecimal.ZERO;
    private String pin;
    private final int accountNumber;
    private final String accountName;

    public Account(int accountNumber, String accountName, String acountPin) {
        pin = acountPin;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public BigDecimal getBalance(String accountPin) {
        if (!accountPin.equals(this.pin)) throw new IllegalArgumentException("Invalid Pin");
        return balance;
    }

    public void withdraw(BigDecimal withdrawAmount, String senderPin) {
        balance = balance.subtract(withdrawAmount);
    }


    @Override
    public String toString() {
        return String.format("""
                =======================
                Account Name: %s
                Account Number: %s
                Account Balance: %s
                =======================""", accountName, accountNumber,balance.toPlainString());

    }
}
