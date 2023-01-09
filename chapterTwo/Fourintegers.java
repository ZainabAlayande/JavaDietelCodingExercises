package chapterTwo;

import java.util.Scanner;

	public class Fourintegers {

	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter first integer: ");
	int firstNumber = input.nextInt();

	System.out.println("Enter second integer: ");
	int secondNumber = input.nextInt();

	System.out.println("Enter third integer: ");
	int thirdNumber = input.nextInt();

	System.out.println("Enter fourth integer: ");
	int fourthNumber = input.nextInt();

	if(firstNumber == secondNumber && secondNumber == thirdNumber && thirdNumber == fourthNumber)
		{System.out.println("Numbers are equal");}
	else
		{System.out.println("Numbers are not equal");}
	
}
}