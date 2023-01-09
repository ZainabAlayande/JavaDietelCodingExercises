package chapterFive;

import java.time.LocalDate;

public class IntegerParseInt {
    public static void main(String[] args) {
        printNumberAsInteger(2);
        printNumberAsInteger("60");
        printNumberAsInteger(3.0);
        //printNumberAsInteger("w");

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now());
        //System.out.println(LocalDate.of());
        //Print the maximum value of Integer
        System.out.println(Integer.MAX_VALUE);

        //Print the maximum of double
        System.out.println(Double.MAX_VALUE);

        //Print the maximum of Long
        System.out.println(Long.MAX_VALUE);

        //Print the maximum of char
        //System.out.println(char.MAX_VALUE);

    }

    private static void printNumberAsInteger(int number) {
        System.out.println(number);
    }

    private static void printNumberAsInteger(double number) {
        var s = String.valueOf(number).split("\\.");
        //System.out.println(Integer.parseInt(s[0]));
        System.out.println((int) number);

    }
    //Char not charing at this point
    private static void printNumberAsInteger(char number) {
        String[] s = String.valueOf(number).split("\\.");
        //System.out.println(Integer.parseInt(s[0]));


    }

    private static void  printNumberAsInteger(String number) {
        System.out.println(Integer.parseInt(number));
    }
}
