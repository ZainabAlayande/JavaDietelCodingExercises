package chapterFive;

import java.util.Scanner;

public class RangingUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number between 1 and 10");
        int number = scanner.nextInt();

        while (number < 1 || number > 10) {
            System.out.println("Invalid number");
            System.out.println("Enter number between 1 and 10");
            number = scanner.nextInt();
        }
    }
}