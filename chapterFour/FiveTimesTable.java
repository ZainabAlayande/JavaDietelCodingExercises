package chapterFour;

import java.util.Scanner;

public class FiveTimesTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
/**int counter = 0;
while (counter <= 11) {
counter = counter + 1;

System.out.printf("%d times %d is %d", number, counter, counter * number);
System.out.println(" ");
}*/



        int numberOfLoopExecutions = 0;

        StringBuffer buffer = new StringBuffer();

        for (int counter = number-1; counter >= 1; counter--) {

            System.out.println("number -> "+number);
            System.out.println("counter -> "+counter);
            System.out.println(number+"*"+counter);
            buffer.append(counter+1);
            buffer.append("*");
            number = number*counter;
            System.out.println(number);
            numberOfLoopExecutions++;
        }
        buffer.append(1);
        System.out.println(buffer);
        System.out.println("factorial is "+number);
        System.out.println("loop executed "+ numberOfLoopExecutions + " times");

        //System.out.printf("%d times %d is %d", number, counter, number*counter);
        //System.out.println();

        }

    }
