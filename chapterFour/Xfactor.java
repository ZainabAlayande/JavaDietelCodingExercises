package chapterFour;

import java.util.Scanner;

public class Xfactor {
    public static void print(String word){
        System.out.println(word);
    }
    public static int inputInt(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        return num;
    }
    public static String inputString(){
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        return num;
    }
    public static void findFactorOfNumber(int num){
        int factor = 0;
        for (int i = 1; i < num+1; i++) {
            if (num % i == 0){
                factor++;
                System.out.print("  "+i);
            }
        }
    }

    public static void main(String[] args) {
        while (true){
        print("enter number to factor  ");
        findFactorOfNumber( inputInt());
            System.out.println();
        print("you wanna continue? \n" +
                "to continue  enter yes \n " +
                "to quit enter no  ");
        String word = inputString();
        if (word.equalsIgnoreCase("yes")){
            continue;
        }else {
            break;
        }
    }
    }
}