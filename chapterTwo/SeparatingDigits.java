package chapterTwo;/*2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user,
separates the number into its individual digits and prints the digits separated from one another by three spaces each. 
For example, if the user types in the number 42339, the program should print*/

import java.util.Scanner;

	public class SeparatingDigits {
		
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter five digits: ");
	int digits = scanner.nextInt();

	int firstDigit = digits / 10000;
	int secondDigit = digits % 10000 / 1000;
	int thirdDigit = digits % 10000 % 1000/100;
	int fourthDigit = digits % 10000 % 1000%100/10;
	int fifthDigit = digits % 10000 % 1000%10/1;

	System.out.printf("%d   %d   %d   %d   %d", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);

}

}