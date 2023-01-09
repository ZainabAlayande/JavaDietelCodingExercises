package chapterFour;

import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {

        //collect the input
        Scanner input = new Scanner(System.in);

        //check userInput
        System.out.println("Enter a number:");
        int userInput = input.nextInt();

        //check userInput
        if (userInput > 10) {
            System.out.println("out of range");
        }
        else {
            if (userInput % 2 == 0) {
                System.out.println("It is even");
            }
            else {
                System.out.println("This is odd biko");
            }
        }
    }
}