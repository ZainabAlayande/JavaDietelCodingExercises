package ChapterSix;
import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {

        SecureRandom randomNumber = new SecureRandom();
        for (int counter = 1; counter <= 100; counter++) {
            int random = 1 + randomNumber.nextInt(100);
            System.out.print(random + " ");

            if (counter % 10 == 0) {
                System.out.println();

        }
        }

        }
    }

