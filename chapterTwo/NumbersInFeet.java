package chapterTwo;

import java.util.Scanner;

	public class NumbersInFeet {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a value for feet: ");
	double enteredFeetValue = input.nextFloat();

	double oneFoot = 0.305;

	double feetInMeters = enteredFeetValue * oneFoot;

	System.out.printf("%.1f feet is %.4f meters", enteredFeetValue, feetInMeters);

}
}

