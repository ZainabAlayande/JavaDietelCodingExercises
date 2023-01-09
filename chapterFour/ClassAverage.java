package chapterFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassAverage {

    private static List<Integer> nums = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("continue to stop: ");
        String userInput = scanner.next();

        while (!userInput.equals("stop")){
            System.out.print("enter a number: ");
            nums.add(scanner.nextInt());

            System.out.print("continue or stop: ");
            userInput = scanner.next();
        }

            int maximum = 0;
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
            maximum = Math.max(maximum, nums.get(i));
    }
        System.out.println("maximum:: "+ maximum);
    }
}
