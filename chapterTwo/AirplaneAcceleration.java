package chapterTwo;

import java.util.Scanner;

	public class AirplaneAcceleration {
	
	public static void main(String[] args){

	Scanner input = new Scanner (System.in);

	System.out.println("Enter take-off speed: ");
	double takeOffSpeed = input.nextFloat();

	System.out.println("Enter acceleration: ");
	double  acceleration = input.nextFloat();

	double minimumLength = (takeOffSpeed * takeOffSpeed)/(2 * acceleration);

	System.out.printf("The minimum runway length for this airplane is %f", minimumLength);

}

}