package chapterFour;

import java.util.Scanner;

public class SwitchCases {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value between 1 and 11: ");
        int value = scanner.nextInt();

        switch(value){

            case 1:
                System.out.print("You are a Goalkeeper");
                break;

            case 2:

            case 5:

            case 3:

            case 4:
                System.out.print("You are a Defender");
                break;

            case 6:

            case 8:

            case 7:
                System.out.print("You are a Midfielder");
                break;

            case 9:

            case 11 :

            case 10:
                System.out.print("You are a Attacker");
                break;

            default:
                System.out.println("You ain't a baller bro, You are a bloody mechanic");
        }

    }
}
