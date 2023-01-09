package chapterTwo;

import java.util.Scanner;

	public class NumbersInPounds {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number in pounds: ");
	double numberInPounds = input.nextFloat();

	double onePound = 0.454;

	double numberInKilograms = numberInPounds * onePound;

	System.out.printf("%.1f pounds is %.3f kilograms", numberInPounds, numberInKilograms);

}

}
