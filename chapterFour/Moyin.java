package chapterFour;

import java.util.Scanner;

public class Moyin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int counter = 0;
        int multiple = 1;
        int counterFactor = number + 1;

        System.out.print(number + "! = ");

        while (counterFactor > 2) {
            counterFactor--;

            System.out.print(counterFactor + " * ");

            while (counter < number) {
                counter++;

            multiple = counter * multiple;
        }
    }

        System.out.println(builder.append(1));
        System.out.println(number + "! = " + multiple);
    }
}
