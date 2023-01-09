package chapterTwo;

import java.util.Scanner;

	public class Palindrome {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter three integers: ");
	int integers = input.nextInt();

	int numberInHundreds = integers/100;
	int numberInTens = integers%100/10;
	int numberInUnit = integers%100%10;

	if (numberInHundreds == numberInUnit)
	  {System.out.println("This is a palindrome");}
	else
	  {System.out.println ("This is not a palindrome");}	
}
}