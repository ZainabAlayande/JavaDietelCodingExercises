package chapterFive;

public class ChristmasTree {
    public static void main(String[] args) {

       int space = 30;
       int loop = 1;

        for (int row = 1; row <= 20; row++) {
            for (int column = 1; column <= space; column++) {
                System.out.print(" ");
            }
            for (int astericks = 1; astericks <= loop; astericks++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
            loop +=2;

        }

        int blank = 20;
        for (int row = 1; row <= 4; row++) {
            for (int column = 1; column <= blank; column++) {
                System.out.print(" ");
            }
            for (int astericks = 1; astericks <= 21; astericks++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
