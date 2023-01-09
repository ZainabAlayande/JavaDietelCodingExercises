package chapterFour;

import java.util.Scanner;

public class DistanceExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1, x2, y1, y2");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println(x1+ " " + x2 + " " + y1 + " " + y2);
        System.out.println(isPerpendicular(x1, x2, y1, y2));

    }

    public static boolean isPerpendicular(int x1, int x2, int y1, int y2) {
        if (x1 == x2 || y1 == y2) {
            return true;
        }
    else {
            return false;}

        }
    }

