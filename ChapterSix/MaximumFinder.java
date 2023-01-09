package ChapterSix;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three floating Number: ");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();


        double result = maximum(firstNumber, secondNumber, thirdNumber);

        System.out.println("Maximum number is: " + result);
    }

    public static double maximum(double numberOne, double numberTwo, double numberThree) {
        double maximumNumber = numberOne;

        if (numberTwo > maximumNumber) {
            maximumNumber = numberTwo;
        }

        if (numberThree > maximumNumber) {
            maximumNumber = numberThree;
        }
        return maximumNumber;
    }
}
