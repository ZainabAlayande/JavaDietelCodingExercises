package chapterSeven.AirlineReservationSystems;

public class BoardingPass {

    public static void delay()  {
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

        System.out.print("Please hang on");
        for (int j = 0; j < 6; j++) {
            System.out.print("_");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println();
        System.out.println();

    }
}
