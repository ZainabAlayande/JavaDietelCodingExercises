package chapterTwo; /**ask to enter a number, tell me it is an odd number or even number*/

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int number = input.nextInt();

	if (number % 2 == 0)
		{System.out.println("It is an even number");}

	if (number % 2 != 0)
		{System.out.println("It is an odd number");}
}
}