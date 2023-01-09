package chapterFive;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

        System.out.println();

        for (int i = 1; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

        System.out.println();

        for (int i = 1; i >= 6; i++) {
            for (int j = i; j >= 6; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

        int blank = 0;
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= blank; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();
            blank+=2;
        }

        System.out.println();

        int blanks = 10;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= blanks; j++) {
                System.out.print(" ");
            }
            for (int j = 1; i >= j; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();
            blanks-=2;
        }

    }
}
