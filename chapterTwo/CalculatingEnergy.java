package chapterTwo;

import java.util.Scanner;

	public class CalculatingEnergy {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the amount of water in kilograms: ");
	double waterInKilograms = input.nextFloat();

	System.out.print("Enter the initial temperature: ");
	double initialTemparature = input.nextFloat();

	System.out.print("Enter the final temperature: ");
	double finalTemparature = input.nextFloat();

	double energyNeeded = waterInKilograms * (finalTemparature - initialTemparature) * 4184;

	System.out.printf("The energy needed is %.1f", energyNeeded);

}

}