package chapterFive;

public class ChibuzoTriangle {
    public static void main(String[] args) {
        int blank = 10;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
                   /**for (int i = 1; i <= 10; i++) {
                for (int j = i; j <= 10; j++) {
                    System.out.print(" ");
                }
                for(int j = i; j <= 10; j++)
                    System.out.print("*");
            }*/

        }
    }



