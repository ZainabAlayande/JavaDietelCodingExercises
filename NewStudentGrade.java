package chapterSeven.StudentGradeApplication;

import java.util.Scanner;

public class NewStudentGrade {
    private static final Scanner scanner = new Scanner(System.in);
    private static int[][] scoreArray;
    static int numberOfStudents;
    static int numberOfSubjects;
    private static int[] totalArray;

    static int totalInAColumn;
    static int passes = 0;
    static int failures = 0;


    public static void inputNumberOfStudentsAndSubjects() {

        System.out.println();
        System.out.println("================================================================================      ");
        System.out.println("*****************   WELCOME TO LAGBAJA STUDENTS GRADE PORTAL   *****************      ");
        System.out.println("================================================================================      ");
        System.out.println();


        System.out.println("How many students do you have?");
        numberOfStudents = scanner.nextInt();

        System.out.println("How many subjects do they offer?");
        numberOfSubjects = scanner.nextInt();

        scoreArray = new int[numberOfStudents][numberOfSubjects];

        System.out.println();
        System.out.println();
        System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Successfully saved");
        System.out.println();
        System.out.println();
    }


    public static void inputScoreForStudentsAndSubjects() {

        int countOfStudents = 1;

        for (int row = 0; row < numberOfStudents; row++) {

            for (int column = 0; column < numberOfSubjects; column++) {
                System.out.println("ENTERING SCORE FOR STUDENT  " + countOfStudents);
                System.out.println("Enter score for subject  " + (column + 1));
                scoreArray[row][column] = scanner.nextInt();

                while (scoreArray[row][column] < 0 && scoreArray[row][column] > 100) {
                    System.out.println("Enter score for subject  " + (column + 1));
                    scoreArray[row][column] = scanner.nextInt();
                }

            }
            System.out.println();
            countOfStudents++;


        }

    }



    public static void studentTable() {
        System.out.println("=======================================================================================");
        System.out.print("STUDENT        ");

        for (int sub = 0; sub < scoreArray[0].length; sub++) {
            System.out.printf("SUB%d%8s", (sub + 1), "");

        }
        System.out.print("TOT");
        System.out.print("       AVE");
        System.out.println("       POS");
        System.out.println("=======================================================================================");

        for (int student = 0; student < scoreArray.length; student++) {
            System.out.printf("Student%2d", (student + 1));

            for (int sub : scoreArray[student]) {
                System.out.printf(" %10d", sub);
            }

            for (int i=0; i<1 ;i++) {
                System.out.printf(" %10d", total()[student]);
            }

            for (int i=0; i<1 ;i++) {
                System.out.printf(" %10.2f", average()[student]);
            }

            for (int i=0; i<1 ;i++) {
                System.out.printf(" %10d", position()[student]);
            }

            System.out.println();
        }
        //System.out.println();
        System.out.println("========================================================================================");
        System.out.println("========================================================================================");

    }



    public static void subjectSummary() {
        System.out.println();
        System.out.println();
        System.out.println("SUBJECT SUMMARY");


        totalInAColumn = 0;
        int column;
        int highestTotal = 0;
        int lowestTotal = 0;
        int maximum;
        int minimum;

        for (int row = 0; row < numberOfSubjects; row++) {
            for (column = 0; column < numberOfStudents; column++) {
                totalInAColumn = totalInAColumn + scoreArray[column][row];

                if (scoreArray[column][row] >= 50) {
                    passes++;
                } else {
                    failures++;
                }
            }
                maximum = scoreArray[0][row];
                for (int j = 0; j < numberOfStudents; j++) {
                    if (scoreArray[j][row] > maximum) {
                        maximum = scoreArray[j][row];
                    }
                }

            minimum = scoreArray[0][row];
            for (int j = 0; j < numberOfStudents; j++) {
                if (scoreArray[j][row] < minimum) {
                    minimum = scoreArray[j][row];
                }

            }


                System.out.printf("Subject %2d%n", (row + 1));
                System.out.println("Highest Scoring Student scored " + maximum);
                System.out.println("Lowest Scoring Student scored " + minimum);
                System.out.printf("Total Score is: %d%n", totalInAColumn);
                System.out.printf("Average Score is: %.2f%n", (double)totalInAColumn / numberOfStudents);
                System.out.printf("Number of Passes is: %d%n", passes);
                System.out.printf("Number of Failures is: %d%n", failures);
                System.out.println();
                totalInAColumn = 0;
                passes = 0;
                failures = 0;

            }

            int bestGraduatingStudent = total()[0];
            int inde = 0;
            for (int i = 0; i < total().length; i++) {
                if (total()[i] > bestGraduatingStudent)
                    bestGraduatingStudent = total()[i];
                    inde = i;

            }

            int worstGraduatingStudent = total()[0];
            int ind = 0;
            for (int j = 0; j < total().length; j++) {
            if (total()[j] < worstGraduatingStudent)
                worstGraduatingStudent = total()[j];
            ind = j;

            }




        System.out.println();
            System.out.println("=============================================================================");
            System.out.println("CLASS SUMMARY");
            System.out.println("=============================================================================");
            System.out.printf("Best Graduating Student scored %d%n" , bestGraduatingStudent);
            System.out.println("=============================================================================");
            System.out.println();
            System.out.println();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.printf("Worst Graduating Student scored %d%n" , worstGraduatingStudent);
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println();
            System.out.println();
            System.out.println("=============================================================================");
            System.out.printf("Class total score is: %.1f%n", getTotalInTheWholeArray());
            System.out.printf("Class Average score is: %.1f%n", getAverageInTheWholeArray());
            System.out.println("=============================================================================");

    }




    public static int[] total(){
    int [] totalArray=new int [scoreArray.length];

    for (int i = 0; i < scoreArray.length; i++) {
        int sum=0;
        for (int j = 0; j <scoreArray[0].length ; j++) {
            sum+=scoreArray[i][j];

        }
        totalArray[i]=sum;
    }
    return totalArray;
    }



    public static  double [] average(){
      double [] averageArray=new double[scoreArray.length];

    for (int i = 0; i <scoreArray.length ; i++) {
        int sum=0;
        double average=0;
        for (int j = 0; j <scoreArray[0].length ; j++) {
            sum+=scoreArray[i][j];
            average=(double)sum/scoreArray[i].length;
        }
        averageArray[i]=average;
    }
      return averageArray;
}



    public static double getTotalInTheWholeArray() {

        double totalSubject = 0;

        for (int row = 0; row < numberOfSubjects; row++) {
            for (int column = 0; column < numberOfStudents; column++) {
                totalSubject = totalSubject + scoreArray[column][row];
            }
        }

        return totalSubject;
    }





    public static double getAverageInTheWholeArray() {

        double totalSubject = 0;

        for (int row = 0; row < numberOfSubjects; row++) {
            for (int column = 0; column < numberOfStudents; column++) {
                totalSubject = totalSubject + scoreArray[column][row];
            }
        }

        return totalSubject/numberOfStudents;

    }



    public static int[] totalBubbleSort(int[] array) {

        int[] arrayToSort = array;

        boolean swapSomething = true;

        while (swapSomething) {
            swapSomething = false;
            for (int i = 0; i < scoreArray.length - 1; i++) {
                if (arrayToSort[i] < arrayToSort[i + 1]) {
                    swapSomething = true;
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = temp;
                }
            }
        }
        return arrayToSort;
    }



        public static int[] sortTotal(){

        return totalBubbleSort(total());
        }



        public static int []position(){
        int [] positionArray=new int[total().length];

            for (int i = 0; i <total().length; i++) {
                for (int j = 0; j < sortTotal().length; j++) {
                    if (total()[i]==sortTotal()[j])
                        positionArray[i]= j+1;
                }

            }
            return positionArray;
        }
}