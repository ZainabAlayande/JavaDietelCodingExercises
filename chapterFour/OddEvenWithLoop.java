package chapterFour;

import java.util.Scanner;

public class OddEvenWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number, enter any negative number to stop: ");
        int number = scanner.nextInt();

        int counter = 0;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        int numberOfEvenNumbers = 0;
        int numberOfOddNumbers = 0;


        while (number > -1) {
            if (number % 2 == 0)
                sumOfEvenNumbers = sumOfEvenNumbers + number;
            if (number % 2 == 0)
                numberOfEvenNumbers = numberOfEvenNumbers + 1;


            if (number % 2 != 0)
                sumOfOddNumbers = sumOfOddNumbers + number;
            if (number % 2 != 0)
                numberOfOddNumbers = numberOfOddNumbers + 1;

            counter = counter + 1;

            System.out.print("Enter a number, enter any negative number to stop: ");
            number = scanner.nextInt();

        }
        System.out.println(" ");
        System.out.printf("Number of Odd Number is: %d%n", numberOfOddNumbers);
        System.out.printf("Number of Even Number is: %d%n", numberOfEvenNumbers);
        System.out.println(" ");
        System.out.printf("Sum of Odd Number is: %d%n", sumOfOddNumbers);
        System.out.printf("Sum of Even Number is: %d%n", sumOfEvenNumbers);
    }
}
