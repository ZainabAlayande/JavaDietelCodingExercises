package chapterSeven.AirlineReservationSystems;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Booking {

    BoardingPass boardingPass = new BoardingPass();

    boolean[] seatingChart = new boolean[10];
    int lengthOfFirstClass = seatingChart.length - 5;
    //String
    int lengthOfEconomy = seatingChart.length;
    static String firstName;
    int numberOfBoarders;
    int boardingType;
    private static final Scanner scanner = new Scanner(System.in);

    public void welcomeAddress() {
        System.out.println();
        System.out.print("""
                                          WELCOME TO\040
                                      AIRLINE RESERVATION\040
                                            SYSTEMS
                """);
        System.out.println();
    }

    public static String nameOfBoarders(){
        System.out.println("Enter your First Name: ");
        firstName = scanner.next();
        System.out.println();
        return firstName;

    }



    public void enterFlightInformation() {
        nameOfBoarders();
        BoardingPass.delay();

        for (int i = 0; i < seatingChart.length - 5; i++) {
            System.out.println("""
                    Enter 1 - First Class
                          2 - Second Class""");
            boardingType = scanner.nextInt();
            System.out.println();

            if (boardingType == 1) {
                seatingChart[i] = true;
                System.out.println(Arrays.toString(seatingChart));
            }
        }

        System.out.println();
        System.out.println("The first Class Section is full");
        for (int i = 5; i < 10; i++) {
                System.out.println("""
                        Enter 2 -> to placed in the economy section
                        Enter 0 -> to exit""");

                int secondary = scanner.nextInt();
                switch (secondary) {
                    case 2:
                        seatingChart[i] = true;
                        System.out.println();
                        System.out.println(Arrays.toString(seatingChart));
                        break;

                    case 0:
                        System.exit(1);

                }
            }
        System.out.println("Both sections are full, next flight available in 3 hours");
        }

}