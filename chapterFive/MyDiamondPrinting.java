package chapterFive;

public class MyDiamondPrinting {
    public static void main(String[] args) {

        int space = 9;
        int loop = 1;
        for (int row = 1; row <= 10; row++) {
            for (int balnks = 1; balnks <= space; balnks++) {
                System.out.print(" ");
            }
            for (int asterisk = 1; asterisk <= loop; asterisk++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
            loop+=2;
        }

        int spaceTwo = 1;
        int loopTwo = 17;
        for (int row = 1; row <= 9; row++) {
            for (int column = 1; column <= spaceTwo; column++) {
                System.out.print(" ");
            }
            for (int asterisk = 1; asterisk <= loopTwo; asterisk++) {
                System.out.print("*");
            }
            spaceTwo++;
            loopTwo-=2;
            System.out.println();

        }



    }
    }
