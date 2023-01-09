package chapterFour;

import java.util.Scanner;

public class PrimeNumberWithALoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        while (true) {
            if (number / number == 1 && number / 1 == number) {
                System.out.println("This is a prime number");}
                System.exit(number);

            if (number / number != 1 && number / 1 != number) {
                System.out.println("This is not a prime number");
                break;
            }

        }
    }
}
