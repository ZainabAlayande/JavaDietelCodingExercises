package chapterTwo;

/**2.31 (Table of Squares and Cubes) Using only the programming techniques you
learned in this chapter, write an application that calculates the squares and cubes 
of the numbers from 0 to 10 and prints the resulting values in table format, 
as shown below.*/

public class Table {

	public static void main (String[] args) {

	int square1 = 1*1;
	int square2 = 2*2;
	int square3 = 3*3;
	int square4 = 4*4;
	int square5 = 5*5;
	int square6 = 6*6;
	int square7 = 7*7;
	int square8 = 8*8;
	int square9 = 9*9;
	int square10 = 10*10;

	int cube1 = 1*1*1;
	int cube2 = 2*2*2;
	int cube3 = 3*3*3;
	int cube4 = 4*4*4;
	int cube5 = 5*5*5;
	int cube6 = 6*6*6;
	int cube7 = 7*7*7;
	int cube8 = 8*8*8;
	int cube9 = 9*9*9;
	int cube10 = 10*10*10;

	System.out.println("Table   Square    Cube");
	System.out.printf("1        %d        %d%n", square1, cube1);
	System.out.printf("2        %d        %d%n", square2, cube2);
	System.out.printf("3        %d	      %d%n", square3, cube3);
	System.out.printf("4        %d	      %d%n", square4, cube4);
	System.out.printf("5        %d	      %d%n", square5, cube5);
	System.out.printf("6        %d	      %d%n", square6, cube6);
	System.out.printf("7        %d	      %d%n", square7, cube7);
	System.out.printf("8        %d	      %d%n", square8, cube8);
	System.out.printf("9        %d	      %d%n", square9, cube9);
	System.out.printf("10       %d        %d%n", square10,cube10);

}
}

