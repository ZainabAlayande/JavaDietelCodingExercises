package PatternWIthUserInput;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numberEntered = scanner.nextInt();

        int space = numberEntered - 1;
        int temp = numberEntered;
        for (int i = 0; i < numberEntered; i++) {
                System.out.print("*  ");
            }

        System.out.println();
        for (int i = 0; i < numberEntered - 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("*  ");
            }
            for (int j = 1; j < space; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i = 0; i < numberEntered; i++) {
                System.out.print("*  ");
            }
        }
    }

