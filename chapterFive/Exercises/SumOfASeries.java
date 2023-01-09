package chapterFive.Exercises;

public class SumOfASeries {
    public static void main(String[] args) {

        long sumOfNum = 0;
        System.out.printf("%1s%20s%n", "N", "Sum of N");
        for (long number = 1; number <= 100; number++) {

            for (long num = 1; num <= number; num++) {
                sumOfNum = sumOfNum + num;
            }
            System.out.printf("%1s%17s%n", number, sumOfNum);
            sumOfNum = 0;

        }
    }
}
