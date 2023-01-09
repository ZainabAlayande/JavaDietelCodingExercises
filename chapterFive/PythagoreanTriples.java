package chapterFive;

public class PythagoreanTriples {
    public static void main(String[] args) {
        System.out.printf("%s%20s%20s%n", "Side 3", "Side 1", "Side 2");

        for (int side3 = 1; side3 <= 500; side3++) {

            for (int side1 = 1; side1 <= 500; side1++) {

                for (int side2 = 1; side2 <= 500; side2++) {

                    if (side3 * side3 == (side1 * side1)+ (side2 * side2)) {
                        System.out.printf("%s%20s%20s%n", side3, side1, side2);
                    }
                }
            }
        }
    }
}


