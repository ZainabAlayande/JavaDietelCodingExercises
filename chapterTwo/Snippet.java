package chapterTwo;

/**2.13 What is the output that will be printed after execution of the following Java code snippet?
Explain why.
int p = 5;
System.out.printf("%d", p + 2 * 4);
System.out.printf("%d", p * 2 + 4);*/


public class Snippet {

	public static void main(String[] args){

	int p = 5;
	System.out.printf("%d%n", p + 2 * 4);
	System.out.printf("%d", p * 2 + 4);

}
}