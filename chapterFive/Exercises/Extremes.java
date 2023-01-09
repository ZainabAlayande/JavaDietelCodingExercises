package chapterFive.Exercises;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many input do you want to enter?");
        int numberOfInput = scanner.nextInt();
        System.out.println();

        int largest;
        int smallest;
        int count = 1;
        System.out.println("Enter number " + count);
        int number = scanner.nextInt();

        largest = number;
        smallest = number;

        while (count < numberOfInput) {

            System.out.println("Enter number " + (count + 1));
            number = scanner.nextInt();
            count++;

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }


        }

        System.out.println();
        System.out.println("Largest is: " + largest);
        System.out.println("Smallest is: " + smallest);
        System.out.println("Sum of the extremes is: " + (largest + smallest));
    }
}
