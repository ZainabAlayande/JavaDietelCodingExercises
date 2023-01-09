package chapterTwo;

import java.util.Scanner;

	public class Minutes {

	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);

	System.out.println("Enter the number of minutes: ");
	int numberOfMinutes = input.nextInt();

	int minutesInYear = numberOfMinutes / 525600;
	int daysInYear = numberOfMinutes / 1440 % 365;


	System.out.printf("%d is approximately %d year and %d days", numberOfMinutes, minutesInYear, daysInYear );
	

	
}
}