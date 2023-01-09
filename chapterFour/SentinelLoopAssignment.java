package chapterFour;

import java.util.Scanner;

public class SentinelLoopAssignment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value, (Punch -1 to stop): ");
        int number = input.nextInt();

        //int controlledCounter = 1;
        int largest = number;
        int smallest = number;

        while (number != -1) {
            //controlledCounter = controlledCounter + 1;

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }

            System.out.print("Enter a value, (Punch -1 to stop): ");
            number = input.nextInt();
        }

            System.out.printf("Largest Number is: %d%n", largest);
            System.out.printf("Smallest Number is: %d", smallest);

    }
}
