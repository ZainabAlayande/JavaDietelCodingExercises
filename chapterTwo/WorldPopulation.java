package chapterTwo;

import java.util.Scanner;

	public class WorldPopulation {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Input current world population: ");
	int worldPopulation = input.nextInt();

	System.out.print("Input annual world population growth rate: ");
	int annualWorldPopulation = input.nextInt();

	int firstYearEstimatedWorldPopulation = annualWorldPopulation * 2;
	int secondYearEstimatedWorldPopulation = annualWorldPopulation * 3;
	int thirdYearEstimatedWorldPopulation = annualWorldPopulation * 4;
	int fourthYearEstimatedWorldPopulation = annualWorldPopulation * 5;
	int fifthYearEstimatedWorldPopulation = annualWorldPopulation * 6;

	System.out.printf("Estimated World Population after One year is %s%n", firstYearEstimatedWorldPopulation);
	System.out.printf("Estimated World Population after Two years is %s%n", secondYearEstimatedWorldPopulation);
	System.out.printf("Estimated World Population after Three years is %s%n", thirdYearEstimatedWorldPopulation);
	System.out.printf("Estimated World Population after Four years is %s%n", fourthYearEstimatedWorldPopulation);
	System.out.printf("Estimated World Population after Five years is %s%n", fifthYearEstimatedWorldPopulation);

}

}