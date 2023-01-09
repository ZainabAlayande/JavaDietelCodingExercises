package chapterTwo;

import java.util.Scanner;
public class Comparingintegers {

	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter one integer:");
	int firstNumber = input.nextInt();

	int firstNumberSquare = firstNumber * firstNumber;
	int total = firstNumber + firstNumberSquare;
	int hundred = 100;

	if (total == hundred) {
 	System.out.printf("%d == %d%n", total, hundred);
	} 
	if (total != hundred) { 
	 System.out.printf("%d != %d%n", total, hundred);
	} 
	if (total < hundred) { 
 	System.out.printf("%d < %d%n", total, hundred);
	} 
	if (total > hundred) { 
	 System.out.printf("%d > %d%n", total, hundred);
	} 
	if (total <= hundred) { 
 	System.out.printf("%d <= %d%n", total, hundred);
	} 
	if (total >= hundred) { 
	System.out.printf("%d >= %d%n", total, hundred);
	
	}
}
}