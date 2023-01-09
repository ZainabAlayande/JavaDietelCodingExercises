package ChapterSix.PracticalExamples;

import java.security.SecureRandom;

public class CrapsGameRebuilt {
    private static final SecureRandom randomNumber = new SecureRandom();

    private enum Status {CONTINUE, LOST, WIN}

    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int TWELVE = 12;


    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
            case ELEVEN:
                gameStatus = Status.WIN;
                break;

            case TWO:
            case THREE:
            case TWELVE:
                gameStatus = Status.LOST;
                break;

            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("Player point is " + myPoint);
                break;
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gameStatus = Status.WIN;
            } else {
                if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }
        }

            if (gameStatus == Status.WIN) {
                System.out.println("Player won");
            } else {
                System.out.println("Player loose");
            }
        }


        public static int rollDice() {
            int dieOne = 1 + randomNumber.nextInt(6);
            int dieTwo = 1 + randomNumber.nextInt(6);

            int sum = dieOne + dieTwo;
            System.out.println("Player rolled " + dieOne + " + " + dieTwo + " = " + sum);
            return sum;
        }
    }
