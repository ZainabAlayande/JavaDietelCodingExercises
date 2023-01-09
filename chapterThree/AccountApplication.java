package chapterThree;

import tdd.BankAccount;

public class AccountApplication {
    public static void main(String[] args) {

        BankAccount tinukeAccount = new BankAccount("Tinuke", "00187653", 1000.00);
        BankAccount rolakeAccount = new BankAccount("Rolake", "0925432786", 500.00);

        tinukeAccount.deposit(15000);
        rolakeAccount.deposit(12000);

        double tinukeBalance = tinukeAccount.getBalance();
        double rolakeBalance = rolakeAccount.getBalance();

        double tinukeDeposit = tinukeAccount.getDeposit();
        double rolakeDeposit = rolakeAccount.getDeposit();

        tinukeAccount.transfer(6000);
        double tinukeTransfer = tinukeAccount.getTransfer();
        double rolakeTransfer =  rolakeAccount.getTransfer();


        System.out.println("Tinuke Initial balance is " + tinukeBalance);
        System.out.println("Rolake Initial balance is " + rolakeBalance);

        System.out.println();
        System.out.println("Tinuke deposited 15,000. Her balance is now " + tinukeDeposit);
        System.out.println("Rolake deposited 12,000. Her balance is now " + rolakeDeposit);

        System.out.println();
        System.out.println("Tinuke transferred 5,000 to rolake ");
        System.out.println("Tinuke balance is now " + tinukeTransfer);
        System.out.println("Rolake balance is " + rolakeTransfer);


    }
}