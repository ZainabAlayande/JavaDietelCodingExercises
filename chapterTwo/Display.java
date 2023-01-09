package chapterTwo;

/**2.10 Assuming that x = 5 and y = 1, what does each of the following statements display?
a) System.out.printf("x = %d%n", x + 5);
b) System.out.printf("Value of %d *%d is %d\n", x, y, (x * y) );
c) System.out.printf("x is %d and y is %d", x, y);
d) System.out.printf("%d is not equal to %d\n", (x + y), (x * y) );*/


public class Display {

	public static void main(String[] args) {

	int x = 5;
	int y = 1;

	System.out.printf("x = %d%n", x + 5);
	System.out.printf("Value of %d *%d is %d\n", x, y, (x * y) );
	System.out.printf("x is %d and y is %d\n", x, y);
	System.out.printf("%d is not equal to %d\n", (x + y), (x * y) );
}

}