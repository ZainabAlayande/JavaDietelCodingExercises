package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        int number = scanner.nextInt();


        int largest = number;
        int smallest = number;
        int counter = 1;

        while (counter < 10) {
            System.out.println("Enter 10 numbers: ");
            number = scanner.nextInt();

            if (number > largest) {
            largest = number; }

            if (number < smallest) {
            smallest = number; }

            counter++;
        }

        System.out.println();
        System.out.println("Largest is: " + largest);
        System.out.println("Smallest is:" + smallest);
        System.out.println("Addition of largest and smallest is: " + (largest + smallest));



    }
}
