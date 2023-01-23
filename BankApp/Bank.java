package ChapterEight.BankApp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    //I have to keep the account somewhere
    List<Account> accounts = new ArrayList<>();
    public void createAccountFor(String firstName, String lastName, String pin) {
        int accountNumber = accounts.size() + 1;
        Account newAccount = new Account(accountNumber, firstName+" "+lastName, pin);
        accounts.add(newAccount);
    }

    public int getNumberOfCustomers() {
        return accounts.size();
    }

    public Account findAccount(int accountNumber) {
        return accounts.get(0);
    }

    //To check the balance, you check the account number and balance
    public BigDecimal checkBalanceFor(int accountNumber, String pin) {
        //Account account = accounts.get(accountNumber);
        Account account = findAccount(accountNumber);
        return account.getBalance(pin);
    }

    public void depositInto(int accountNumber, BigDecimal amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
        //findAccount(accountNumber).deposit(amount);
    }

    public void withdrawFrom(int accountNumber, BigDecimal amount, String pin) {
        findAccount(accountNumber).withdraw(amount, pin);
    }


    public void transfer(BigDecimal amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {
        //For transfer, never deposit first, withdraw first before deposit for transfer
        //get the money first, let it leave the account first
        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);
        senderAccount.withdraw(amount, senderPin);
        receiverAccount.deposit(amount);
    }
}
