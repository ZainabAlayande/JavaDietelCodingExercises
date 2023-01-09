package chapterTwo;

import java.util.Scanner;

	public class Returnvalue {

	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter first integer: ");
	int firstNumber = input.nextInt();

	System.out.println("Enter second integer: ");
	int secondNumber = input.nextInt();

	if (firstNumber > secondNumber) {
		System.out.printf("Result: %d%n", firstNumber);
	}
	if (firstNumber < secondNumber) {
		System.out.printf("Result: %d%n", secondNumber);
	}

	if (firstNumber == secondNumber) {
		System.out.printf("Result: %d%n", 0);
	}
	
		
	if (firstNumber % 6 == secondNumber % 6)  
	if (firstNumber > secondNumber);
		System.out.println(secondNumber);

	if (firstNumber == secondNumber)
		System.out.println("There is no smaller number, they are equal!");

}
}