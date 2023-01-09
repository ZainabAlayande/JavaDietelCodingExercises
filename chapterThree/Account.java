package chapterThree;

import ServerClasses.AccServer;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        AccServer accountOne = new AccServer("Jane Green", 50.00);
        AccServer accountTwo = new AccServer("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n", accountOne.getName(), accountOne.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", accountTwo.getName(), accountTwo.getBalance());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter deposit amount for accountOne: ");
        double depositAmount = scanner.nextDouble();
        System.out.printf("%nadding %.2f to accountOne balance%n%n", depositAmount);
        accountOne.deposit(depositAmount);


        System.out.printf("%s balance: $%.2f%n", accountOne.getName(), accountOne.getBalance());
        System.out.printf("%s balance: $%.2f%n", accountTwo.getName(), accountTwo.getBalance());


        System.out.print("Enter deposit amount for accountTwo: ");
        depositAmount = scanner.nextDouble();
        System.out.printf("%nadding %.2f to accountTwo balance%n%n", depositAmount);
        accountTwo.deposit(depositAmount);


        System.out.printf("%s balance: $%.2f%n", accountOne.getName(), accountOne.getBalance());
        System.out.printf("%s balance: $%.2f%n", accountTwo.getName(), accountTwo.getBalance());


        System.out.print("Enter withdrawal amount for accountOne: ");
        double withdrawalAmount = scanner.nextDouble();
        System.out.printf("%nSubtracting %.2f from accountOne balance%n%n", withdrawalAmount);
        accountOne.withdrawal(withdrawalAmount);

        System.out.print("Enter withdrawal amount for accountTwo: ");
        withdrawalAmount = scanner.nextDouble();
        System.out.printf("%nSubtracting %.2f from accountTwo balance%n%n", withdrawalAmount);
        accountTwo.withdrawal(withdrawalAmount);

        System.out.printf("%s balance: $%.2f%n", accountOne.getName(), accountOne.getBalance());
        System.out.printf("%s balance: $%.2f%n", accountTwo.getName(), accountTwo.getBalance());



    }
}
