package chapterTwo;/* 2.15 - Write an application that asks the user to enter two integers, obtains them from
the user and prints the square of each, the sum of their squares, and the difference of the squares (first
number squared minus the second number squared).*/

import java.util.Scanner;

public class Square {

	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter one integer");
	int firstNumber = scanner.nextInt();
	

	System.out.print("Enter second integer");
	int secondNumber = scanner.nextInt();

	int firstSquare = firstNumber * firstNumber;
	int secondSquare = secondNumber * secondNumber;

	int sumSquare = firstSquare + secondSquare;
	int squarediff = firstSquare - secondSquare;

	System.out.printf("%n%d is the square of first Integer%n%d is the square of second Integer%n%n%d is the sum of the Square %n%d is the difference of the Square", firstSquare, secondSquare, sumSquare, squarediff);	

}

}

