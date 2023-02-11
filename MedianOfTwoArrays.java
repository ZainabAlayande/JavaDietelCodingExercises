package MoyinSnacks;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoArrays {
    static Scanner keyboardInputCollector = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrayOne = {6, 4, 2};
        int[] arrayTwo = {4, 10, 9, 8};


        supplyArray(arrayOne, arrayTwo);

    }


    public static void supplyArray(int[] arrayOne, int[] arrayTwo) {

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int resultOfArrayOne;
        int resultOfArrayTwo;
            if (arrayOne.length % 2 == 0    &&    arrayTwo.length % 2 == 0) {
                   resultOfArrayOne = arrayOne[arrayOne.length/2] + arrayOne[(arrayOne.length/2) - 1];
                resultOfArrayTwo = arrayTwo[arrayTwo.length/2] + arrayTwo[(arrayTwo.length/2) - 1];
                System.out.print("Median of Array One and Array Two = ");
                display(resultOfArrayOne + resultOfArrayTwo);
            }


            else if (arrayOne.length % 2 != 0    &&    arrayTwo.length % 2 != 0) {
            resultOfArrayOne = arrayOne[arrayOne.length/2] + arrayTwo[(arrayTwo.length/2)];
                System.out.print("Median of Array One and Array Two = ");
                display(resultOfArrayOne);


        }
            else if (arrayOne.length % 2 == 0    &&    !(arrayTwo.length % 2 == 0)) {
                resultOfArrayOne = arrayOne[arrayOne.length/2] + arrayOne[(arrayOne.length/2) - 1];
                resultOfArrayTwo = arrayTwo[arrayTwo.length/2];
                System.out.print("Median of Array One and Array Two = ");
                display(resultOfArrayOne + resultOfArrayTwo);
            }

            else if (!(arrayOne.length % 2 == 0)    &&    arrayTwo.length % 2 == 0) {
                resultOfArrayOne = arrayOne[arrayOne.length/2];
                resultOfArrayTwo = arrayTwo[arrayTwo.length/2] + arrayTwo[(arrayTwo.length/2) - 1];
                System.out.print("Median of Array One and Array Two = ");
                display(resultOfArrayOne + resultOfArrayTwo);
            }

    }




    public static void display(int prompt) {
        System.out.println(prompt);
    }

    public static String input(String prompt){
        display(Integer.parseInt(prompt));
        return keyboardInputCollector.nextLine();
    }
}
