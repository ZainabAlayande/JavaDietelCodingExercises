package chapterFour;

import java.util.Scanner;

public class FourteenTimesTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int counter = 0;
        //int multiplication = counter * counter;
        while (counter < 12) {
            counter = counter + 1;

            System.out.printf("%d times %d is %d", number, counter, counter*14);
            System.out.println();
        }
    }
}
