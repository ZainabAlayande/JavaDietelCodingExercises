package GuessNumberGame;

public class Player {

    public String name;
    public static double amount;
    public static double total;


    public Player(double amount) {
        Player.amount = amount + (amount -Game.amountToStake);
        System.out.println(Player.amount);
    }

    public Player(String name)  {
        this.name = name;


    }





}
