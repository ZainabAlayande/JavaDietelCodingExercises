package ChapterSix.GuessGame;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    static Scanner scanner = new Scanner(System.in);
    static Random randomNumber = new Random();
    static int numberToBeGuessed = randomNumber.nextInt(1001);
    static String nameOfPlayerOne;
    static String nameOfPlayerTwo;


    public GuessTheNumber(){

    }



    public static void letsPlay() {
        GuessTheNumber.guessPrompt();
        GuessTheNumber.promptForPlayerOne();
        GuessTheNumber.promptForPlayerTwo();
        GuessTheNumber.promptToPlayGameAgain();

    }


    public static void guessPrompt() {
        System.out.println("WELCOME! - YOU ARE ABOUT TO PLAY THE GUESS GAME");
        System.out.println();

        System.out.println("Enter name of Player 1 ");
        nameOfPlayerOne = scanner.next();

        System.out.println();

        System.out.println("Enter name of Player 2 ");
        nameOfPlayerTwo = scanner.next();
        System.out.println();

    }




    public static void promptForPlayerOne() {
        int rightGuess = numberToBeGuessed;

        System.out.println(nameOfPlayerOne + " Its your turn to play ");
        int playerOneGuess = scanner.nextInt();

        if (playerOneGuess > rightGuess) {
            System.out.println("Too high!!!");
        } else if (playerOneGuess < rightGuess){
            System.out.println("Too Low");
        } else {
            System.out.println("Congratulations " + nameOfPlayerOne + "you got it right");
            System.exit(1);
        }
        promptForPlayerTwo();

    }


    public static void promptForPlayerTwo() {
        int rightGuess = numberToBeGuessed;

        System.out.println(nameOfPlayerTwo + " Its your turn to play ");
        int playerTwoGuess = scanner.nextInt();

        if (playerTwoGuess > rightGuess) {
            System.out.println("Too high!!!");
        } else if (playerTwoGuess < rightGuess){
            System.out.println("Too Low");
        } else {
            System.out.println("Congratulations" + nameOfPlayerTwo + "you got it right");
            System.exit(1);
        }
        promptForPlayerOne();
    }


    public static void promptToPlayGameAgain() {
        System.out.println("Do you want to play again?\n" +
                           "PRESS" +
                           "1. To play Again" +
                           "2. To Exit Game");
        int response = scanner.nextInt();

        switch (response) {
            case 1:
               gameAgain();

            case 2:
                System.exit(1);
        }
    }



    private static void gameAgain() {
        letsPlay();
    }

}