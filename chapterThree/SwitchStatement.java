package chapterThree;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                1. 2000
                2. 5000
                3. 10000
                4. 15000
                5. 2000
                6. Other amounts
                                
                """);

        System.out.println("Pick an option: ");
        int input = scanner.nextInt();

        switch (input) {

            case 1:
                System.out.println("Take your 2k");

            case 2:
                System.out.println("Take your 5k");
                break;

            case 3:
                System.out.println("Take your 10k");
                break;

            default:
                System.out.println("Money don finish");
        }
    }
}