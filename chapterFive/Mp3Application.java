package chapterFive;

import tdd.Mp3Player;

import java.util.Scanner;

public class Mp3Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mp3Player oraimoMp3 = new Mp3Player(true, true, true, 10, 5, 10, 10);

        boolean On = oraimoMp3.getPowerButton();
        if (oraimoMp3.getPowerButton() == true) {
        System.out.println("Welcome!!! Oraimo Mp3 designed for you, ");
            System.out.println();
        }

        System.out.println("""
                PRESS
                1 ** Music
                2 ** Videos
                3 ** Comedy""");
        System.out.println();
             int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                System.out.println("""
                        --> Asake Organise
                        --> YoungJohn XtraCool
                        --> Tems ft Wizkid Essence
                        --> Simi ft Adekunle Gold Balance
                        --> Fireboy Playboy""");
                if (selection == oraimoMp3.getPrevious()) {
                    System.out.println(selection);}
                System.out.println();
        int songs = scanner.nextInt();
        switch (songs) {
            case 1:
                System.out.println("   NOW PLAYING.................");
                System.out.println("              Asake          \n             Organise");
                System.out.println("DOWNLOAD LATEST MUSIC AND COMEDY VIDEOS\n           FROM WAP LOADED   ");
                break;

            case 2:
                System.out.println("   NOW PLAYING.................");
                System.out.println("            YoungJohn          \n             XtraCool");
                System.out.println("DOWNLOAD LATEST MUSIC AND COMEDY VIDEOS\n           FROM WAP LOADED   ");
                break;

            case 3:
                System.out.println("   NOW PLAYING.................");
                System.out.println("           Tems ft Wizkid          \n             Essence");
                System.out.println("DOWNLOAD LATEST MUSIC AND COMEDY VIDEOS\n           FROM WAP LOADED   ");
                break;

            case 4:
                System.out.println("   NOW PLAYING.................");
                System.out.println("        Simi ft Adekunle Gold          \n               Balance");
                System.out.println("DOWNLOAD LATEST MUSIC AND COMEDY VIDEOS\n           FROM WAP LOADED   ");
                break;

            case 5:
                System.out.println("   NOW PLAYING.................");
                System.out.println("               Fireboy          \n               Playboy");
                System.out.println("DOWNLOAD LATEST MUSIC AND COMEDY VIDEOS\n           FROM WAP LOADED   ");
                break;

        }
        switch (selection) {
            case 2:
                System.out.println("VIDEOS");
        }

        switch (selection) {
            case 3:
                System.out.println("COMEDY");
                }
        }
    }
}
