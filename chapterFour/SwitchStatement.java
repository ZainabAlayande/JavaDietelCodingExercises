package chapterFour;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Whats your name: ");
        int age = scanner.nextInt();

        switch (age) {
            /**case 20:
                System.out.println("Getat");
                break;
            case 40:
                System.out.println("You try small");
                break;
            default:
                System.out.println(age);*/
            case 20 -> System.out.println("getat!!!");
            case 40 -> System.out.println("You try small");
            default -> System.out.println(age);

        }
    }
}
