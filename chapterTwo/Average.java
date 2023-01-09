package chapterTwo;

import java.util.Scanner;

	public class Average {

	public static void main (String[] args) {

	Scanner input = new Scanner (System.in);

	System.out.println("Enter one number: ");
	int firstNumber = input.nextInt();

	System.out.println("Enter second number: ");
	int secondNumber = input.nextInt();

	System.out.println("Enter third number: ");
	int thirdNumber = input.nextInt();
	
	int average = (firstNumber + secondNumber + thirdNumber) / 3;

	System.out.printf("Average: %d", average);


}

}