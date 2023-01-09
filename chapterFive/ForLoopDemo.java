package chapterFive;

public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("first loop prints " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("second loop prints " + j);
                for (int k = 1; k <= 3; k++) {
                    System.out.println("third loop prints " + k);

                }

            }

        }
    }
}
