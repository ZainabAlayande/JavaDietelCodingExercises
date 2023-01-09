package chapterTwo;

import java.util.Scanner;

	public class TestData {
	
	public static void main(String[] args){

	Scanner input = new Scanner (System.in);

	System.out.println("Input first number: ");
	int firstNumber = input.nextInt();

	System.out.println("Input second number: ");
	int secondNumber = input.nextInt();

	int sum = firstNumber + secondNumber;
	int subtraction = firstNumber - secondNumber;
	int product = firstNumber * secondNumber;
	int division = firstNumber / secondNumber;
	int remainder = firstNumber % secondNumber;

	System.out.printf("Sum = %d%nSubtraction = %d%nProduct = %d%nDivision = %d%nRemainder = %d%n", sum, subtraction, product, division, remainder);

}


}