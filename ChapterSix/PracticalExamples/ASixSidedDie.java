package ChapterSix.PracticalExamples;

import java.security.SecureRandom;

public class ASixSidedDie {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        int frequencyOne = 0;
        int frequencyTwo = 0;
        int frequencyThree = 0;
        int frequencyFour = 0;
        int frequencyFive = 0;
        int frequencySix = 0;

        for (int roll = 1; roll <= 60_000_000; roll++) {
            int faceOfCoin = 1 + randomNumbers.nextInt(6);

            switch (faceOfCoin) {
                case 1:
                    ++frequencyOne;
                    break;
                case 2:
                    ++frequencyTwo;
                    break;
                case 3:
                    ++frequencyThree;
                    break;
                case 4:
                    ++frequencyFour;
                    break;
                case 5:
                    ++frequencyFive;
                    break;
                case 6:
                    ++frequencySix;
                    break;
            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n",
                    frequencyOne, frequencyTwo, frequencyThree, frequencyFour,
                    frequencyFive, frequencySix);

    }
}
