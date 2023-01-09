package chapterFour;

import java.util.Scanner;

public class ClassPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value, (Punch 0 to stop): ");
        int number = input.nextInt();

        int largest = number;
        int smallest = number;

        do {
            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }

            System.out.print("Enter a value, (Punch 0 to stop): ");
            number = input.nextInt();
        }

                while (number != 0);


        System.out.println();
        System.out.printf("Largest is: %d%n", largest);
        System.out.printf("Smallest is: %d", smallest);
    }
}
