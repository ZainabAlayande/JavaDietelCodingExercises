package chapterFour;

import java.util.Scanner;

public class IfSingleStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade: ");
        int studentGrade = input.nextInt();

        if (studentGrade >= 90) {
            System.out.println("A");
        } else if (studentGrade >= 80) {
            System.out.println("B");
        } else if (studentGrade >= 70) {
            System.out.println("C");
        }

        //else
        //   if (studentGrade >= 60) {
        //     System.out.println("D");
        //}
        System.out.println(studentGrade >= 60 ? "Passed" : "Failed");

        //else
        //       System.out.println("F");
        // }


    }
}



