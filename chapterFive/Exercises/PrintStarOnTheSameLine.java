package chapterFive.Exercises;

public class PrintStarOnTheSameLine {
    public static void main(String[] args) {

        int blanks = 15;
        int fiveSpaces = 5;
        int tenStars = 10;
        for (int row = 1; row <= 10; row++) {
            for (int column1 = 1; column1 <= row; column1++) {
                System.out.print("*");
                }
                for (int space = 1; space <= blanks; space++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= tenStars; j++) {
                    System.out.print("*");
                }
                for (int spaces = 1; spaces <= fiveSpaces; spaces++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= tenStars; j++) {
                    System.out.print("*");
                }
                for (int space = 1; space <= blanks; space++) {
                System.out.print(" ");
                }
                for (int column1 = 1; column1 <= row; column1++) {
                System.out.print("*");
                }
            System.out.println();
                blanks--;
                tenStars--;
                fiveSpaces+=2;

            }

        }
    }

