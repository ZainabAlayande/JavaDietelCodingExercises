package chapterTwo;

import java.util.Scanner;

	public class BMI {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Please enter your weight in Kilograms (kg):");
	float weightInKilograms = input.nextFloat();
		
	System.out.print("Please enter your height in meters (m):");
	float heightInMeters = input.nextFloat();

	float bmi = (weightInKilograms*703)/heightInMeters*heightInMeters;

	if (bmi < 18.5) {
		System.out.println("According to the National Heart, Lung ,and Blood Institute you are UNDERWEIGHT!!! ");
		}

	if ((bmi >= 18.5) && (bmi <= 24.9)) {
		System.out.println("According to the National Heart, Lung ,and Blood Institute you have a NORMAL WEIGHT ");
		}

	if ((bmi >= 25) && (bmi <= 29.9)) {
		System.out.println("According to the National Heart, Lung ,and Blood Institute you are OVER-WEIGHT!!! ");
		}

	if (bmi > 30) {
		System.out.println("According to the National Heart, Lung ,and Blood Institute you are OBESE(SEEK HELP)!!!!!! ");
		}			
										

}
}