package chapterFive.Exercises;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {

        int sum = 0;
        for (int integer = 1; integer <= 30; integer++) {
            if (integer % 3 == 0) {
                sum+=integer;
            }
        }
        System.out.println("Sum of integers between 1 and 30 that are divisible by 3: " + sum);
    }
}
