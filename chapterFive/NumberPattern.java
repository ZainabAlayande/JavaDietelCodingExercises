package chapterFive;

public class NumberPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

        System.out.println();
        }

        System.out.println();

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();
        int spaces = 0;
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
            spaces++;
        }

        System.out.println();

        int blank = 0;
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= blank; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
            blank+=2;
        }

        System.out.println();

        int space = 10;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
            space-=2;
        }

        System.out.println();

        int blanks = 10;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= blanks; j++) {
                System.out.print(" ");
            }
            for (int j = 1; i >= j; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
            blanks-=2;
        }
    }
}
