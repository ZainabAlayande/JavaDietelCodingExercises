package chapterFour;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String superscript = "";
        int sum = 0;

        for (int counter = 1; counter < 11; counter++) {

            if (counter == 1) superscript = "st";

            else if (counter == 2) superscript = "nd";

            else if (counter == 3) superscript = "rd";

            else {superscript = "th";}

            System.out.print("Enter " + counter + superscript + " grade: ");
            int grade = scanner.nextInt();
            sum = grade + sum;

            }
            int average = sum / 10;

            System.out.printf("Sum of grade is: %d%n", sum);
            System.out.printf("Average of grade is: %d%n", average);
        }
    }



