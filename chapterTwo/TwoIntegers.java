package chapterTwo;

import java.util.Scanner;

	public class TwoIntegers {

	public static void main (String[] args){

	Scanner input = new Scanner (System.in);

	System.out.println("Input first integer: ");
	int firstInteger = input.nextInt();
	int maximumNumber = firstInteger;
	int minimumNumber = firstInteger;

	System.out.println("Input second integer: ");
	int secondInteger = input.nextInt();

	if (secondInteger > maximumNumber) {
		maximumNumber = secondInteger;}

	if (secondInteger < minimumNumber) {
		minimumNumber = secondInteger;}

	int sum = firstInteger + secondInteger;
	int difference = firstInteger - secondInteger;
	int product = firstInteger * secondInteger;
	int average = (firstInteger + secondInteger)/2;
	int distance = secondInteger - firstInteger;
	
	System.out.printf("Sum: %d%nDifference: %d%nProduct: %d%nAverage: %d%nDistance: %d%nMaximum: %d%nMinimum: %d%n",sum,difference,product,average,distance, maximumNumber, minimumNumber);


}

}