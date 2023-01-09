package chapterTwo;

import java.util.Scanner;

	public class AreaOfHexagon {
	
	public static void main(String[] args){

	Scanner input = new Scanner (System.in);

	System.out.println("Input the length of a side of the hexagon: ");
	double lengthOfSideHexagon = input.nextFloat();

	double areaOfHexagon = (6*lengthOfSideHexagon*lengthOfSideHexagon)/(4*Math.tan(Math.PI/6));

	System.out.printf("The area of the hexagon is %f", areaOfHexagon);

}

}