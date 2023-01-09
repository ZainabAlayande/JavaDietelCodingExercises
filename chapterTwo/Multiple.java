package chapterTwo;/* Write an application that reads two integers, determines whether the first
number tripled is a multiple of the second number doubled, and prints the result. 
[Hint: Use the remainder operator.] */


import java.util.Scanner;
public class Multiple {

	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter first integer: ");
	int firstInt = input.nextInt();

	System.out.println("Enter second integer: ");
	int secondInt = input.nextInt();
	
	int firstIntTrippled = firstInt*3;
	int secondIntDoubled = secondInt*2;

	if ((firstIntTrippled /secondIntDoubled) == 0){
	System.out.println("yes, firstinttrippled is a multiple secondintdoubled");
	}
	if ((firstIntTrippled / secondIntDoubled) != 0){
	System.out.println("No, firstinttrippled is not a multiple of secondintdoubled");
	}

	}


}























