package chapterTwo;

import java.util.Scanner;

public class IntegerAddition {

	public static void main (String[] args) {

	Scanner input = new Scanner (System.in);

	System.out.println("Enter a number between 0 and 1000");
	int number = input.nextInt();

	int numberInHundreds = number/100%10;
	int numberInTens = number/10%10;
	int numberInUnit = number/1%10;

	int sum = numberInHundreds + numberInTens + numberInUnit;
	System.out.printf("The sum of the digits is %d", sum); 

	
}

}