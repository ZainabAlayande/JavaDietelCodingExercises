package GuessNumberGame;

public class Time {

    public void delay()  {

        System.out.print("Saving");
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println();
        System.out.println();

    }
}
