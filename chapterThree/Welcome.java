package chapterThree;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Native pauline = new Native();
        String herName = pauline.getName();
        System.out.println(herName);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter new name");
        String newName = input.nextLine();
        pauline.setName(newName);
        herName = pauline.getName();
        System.out.println(herName);


    }
}
