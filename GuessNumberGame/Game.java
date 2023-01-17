package GuessNumberGame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    Rules rules = new Rules();
    Time time = new Time();

    private static final Scanner scanner = new Scanner(System.in);

    private final double defaultAmount = 1000.00;
    ArrayList<String> namesOfPlayers = new ArrayList<>();

    String winner;
    int guessedNumber;
    static int numberOfPlayer;


    static double amountToStake;

    public void welcomeToGame() {
        System.out.println();
        System.out.println("*************************************************************************");
        System.out.println("WELCOME, YOU ARE ABOUT TO PLAY NUMBER GUESSING GAME\n" +
                "PLEASE STAY PREPARED");
        System.out.println("*************************************************************************");

        rules.theGameRules();
    }


    public void addNewLine() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }


    public void promptForNumberOfPlayer() {
        addNewLine();

        while (true) {
            try {
                System.out.println("How many player's are ready for today's ride: ");
                numberOfPlayer = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input! Enter correct input please");
                System.out.println();
                scanner.nextLine();
            }
        }
        time.delay();

    }

    public void enterNamesOfPlayer() {

        for (int count = 1; count <= numberOfPlayer; count++) {
            System.out.println("Enter name of player " + count);
            String name = scanner.next();
            new Player(name);
            namesOfPlayers.add(name);
            System.out.println();
        }
    }


    public void enterAmountToStake() {
        System.out.println();

        while (true) {
            try {
                System.out.println("Please enter amount to stake: ");
                amountToStake = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter amount to stake");
                scanner.nextLine();
            }
        }
        time.delay();
    }


    public void startGame() {
        System.out.println();

        for (int element = 0; element < namesOfPlayers.size(); element++) {
            System.out.println();
            System.out.println(namesOfPlayers.get(element) + " It's your turn to play (Guess a number between 1 and 1000)");
            guessedNumber = scanner.nextInt();

            if (guessedNumber < Guess.numberToBeGuessed) {
                System.out.println("No " + namesOfPlayers.get(element) + ", Number is too Low!");
            }

            if (guessedNumber > Guess.numberToBeGuessed) {
                System.out.println("No " + namesOfPlayers.get(element) + ", Number is too High!");
            }

            if (guessedNumber == Guess.numberToBeGuessed) {
                System.out.println("Waaaaoooo!!!!! " + namesOfPlayers.get(element) + ", You got the number correctly!");
                winner = namesOfPlayers.get(element);
                break;
            }
        }

        if (guessedNumber != Guess.numberToBeGuessed) {
            startGame();
        }
    }




    public void getBalance() {
        addNewLine();
        System.out.println("****************************************************");
        System.out.println("* My Champs, the " + numberOfPlayer + " of you staked with $" + amountToStake + " *");
        System.out.println("        BELOW IS YOUR BALANCE CHAMPS");
        System.out.println("****************************************************");
        time.delay();
        System.out.print("** " + winner + " Our winner, your balance is ");
        Player p = new Player(1000.00);
    }


    public void stakeDetails() {
        for (int element = 0; element < namesOfPlayers.size(); element++) {
            if (namesOfPlayers.get(element).equals(winner)) {
                continue;
            }
            System.out.println("** " + namesOfPlayers.get(element) + " Your stake bet is gone, your balance is now " + (defaultAmount - amountToStake));

        }
    }

    public void playAgain() {
        addNewLine();
            try {
                System.out.println("""
                Do you want to play game again?
                PRESS 1 - to Play Again
                      2 - to exit game""");
                int playAgain = scanner.nextInt();

                switch (playAgain) {
                    case 1:
                        letsPlayAgain();

                    case 2:
                        System.out.println("Thank You for gaming with us today, see you next time champ");
                        System.exit(1);
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Re-enter pls");
                scanner.next();
            }
    }

        public void letsPlay() {
                welcomeToGame();
                promptForNumberOfPlayer();
                enterNamesOfPlayer();
                enterAmountToStake();
                startGame();
                getBalance();
                stakeDetails();
        }

    public void letsPlayAgain() {
        promptForNumberOfPlayer();
        enterNamesOfPlayer();
        enterAmountToStake();
        startGame();
        getBalance();
        stakeDetails();
        playAgain();
    }
}











