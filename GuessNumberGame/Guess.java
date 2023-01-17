package GuessNumberGame;

import java.util.Random;

public class Guess {

    static Random randomNumber = new Random();

    static int numberToBeGuessed = randomNumber.nextInt(1001);
}
