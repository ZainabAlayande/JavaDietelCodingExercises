package chapterFive.Exercises;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        System.out.println("Enter student name: ");
        String studentName = scanner.next();

        int gradeCounter = 1;
        while (gradeCounter <= 5) {

            System.out.println("Enter student " + gradeCounter + " grade");
            String letterGrade = scanner.next();

            switch (letterGrade) {
                case "A":
                    aCount++;

                case "B":
                    bCount++;

                case "C":
                    cCount++;

                case "D":
                    dCount++;


                    gradeCounter++;
            }
        }
        System.out.println();
        System.out.println(aCount + " student scored A");
        System.out.println(bCount + " student scored B");
        System.out.println(cCount + " student scored C");
        System.out.println(dCount + " student scored D");

    }
}
