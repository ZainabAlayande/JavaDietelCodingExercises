package chapterFour;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int counter = 1;
        int factorsCounter = 0;

         while (counter <= number) {
             if (number % counter == 0) {
                 factorsCounter = factorsCounter + 1;

             }

             counter = counter + 1;

         }
        System.out.printf("%d has %d factors", number, factorsCounter);

    }
}
