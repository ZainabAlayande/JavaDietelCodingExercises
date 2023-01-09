package chapterTwo;

import java.util.Scanner;

	public class Commondigit {

	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter first integer between 25 and 75: ");
	int firstInteger = input.nextInt();
	
	System.out.println("Enter second integer between 25 and 75: ");
	int secondInteger = input.nextInt();

		int firstCommonDigit = firstInteger % 10;
		int secondCommonDigit = secondInteger % 10;

		if (firstCommonDigit == 5 && secondCommonDigit == 5) {
			System.out.println("True");}
		else
			{System.out.println("False");}


	}
}