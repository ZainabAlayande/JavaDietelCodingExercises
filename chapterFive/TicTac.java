package chapterFive;

public class TicTac {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 1; j++) {
                System.out.print("O X O" + " ");
            }
            System.out.println(" ");
        }

        System.out.println();

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j < i; j++) {
                System.out.println("O");
                System.out.print("X");
            }
            for (int j = 1; j < i; j++) {
                System.out.println("O");
            }

        }




}
}
