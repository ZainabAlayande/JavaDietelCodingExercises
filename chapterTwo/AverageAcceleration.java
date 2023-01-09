package chapterTwo;

import java.util.Scanner;

	public class AverageAcceleration {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the starting velocity in meters/second: ");
	double startingVelocity = input.nextFloat();

	System.out.print("Enter the ending velocity in meters/second: ");
	double endingVelocity = input.nextFloat();

	System.out.print("Enter the time span in seconds: ");
	double timeSpan = input.nextFloat();

	double averageAcceleration = (endingVelocity - startingVelocity) / timeSpan;

	System.out.printf("The average acceleration is %.4f", averageAcceleration);

}

}