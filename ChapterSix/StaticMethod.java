package ChapterSix;

import java.util.Scanner;

public class StaticMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three floating-point values: ");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();

        double result = maximum(firstNumber, secondNumber, thirdNumber);
        System.out.print("Maximum floating-point value is: " + result);
    }

    private static double maximum(double x, double y, double z) {
        double maximum = x;
        if (y > maximum) {
            maximum = y;
        }

        if (z > maximum) {
            maximum = z;
        }

        return maximum;
    }
}
