package chapterFive;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                     PRESS
                1 --> Phonebook
                2 --> Messages
                3 --> Chat
                4 --> Call Register
                5 --> Tones
                6 --> Settings
                7 --> Call divert
                8 --> Games
                9 --> Calculator
                10 --> Reminders
                11 --> Clock
                12 --> Profiles
                13 --> SIM Services""");
        System.out.println();
        int function = scanner.nextInt();
        switch (function) {
            case 1:
                System.out.println("""
                        """ +
                        "1 --> Search\n" +
                        "2 --> Service Nos\n" +
                        "3 --> Add Name\n" +
                        "4 --> Erase\n" +
                        "5 --> Edit\n" +
                        "6 --> Assign tone\n" +
                        "7 --> Send b card\n" +
                        "8 --> Options\n" +
                        "9 --> Speed dials\n" +
                        "10 --> Voice tags\n");
                System.out.println();
                int function8 = scanner.nextInt();
                switch (function8) {
                    case 8:
                        System.out.println("" +
                                "   PRESS\n" +
                                "1 --> Type of view\n" +
                                "2 --> Memory Status\n");
                        System.exit(1);
                }
            case 2:
                System.out.println("""
                        1 --> Write Messages
                        2 --> Inbox
                        3 --> Outbox
                        4 --> Picture messages
                        5 --> Templates
                        6 --> Smileys
                        7 --> Message Settings
                        8 --> Info service
                        9 --> Voice mailbox number
                        10 --> Service command editor""");
                System.out.println();
                int function7 = scanner.nextInt();
                switch (function7) {
                    case 7:
                        System.out.println("""
                                1 --> Set
                                2 --> Common""");
                        break;
                }
                int function7to1 = scanner.nextInt();
                switch (function7to1) {
                    case 1:
                        System.out.println("""
                                1 --> Message centre number
                                2 --> Message sent as
                                3 --> Message validity""");
                        break;
                    case 2:
                        System.out.println("""
                                1 --> Delivery reports
                                2 --> Reply via same centre
                                3 --> Character support""");
                        break;
                }
            case 3:
                System.out.println("""
                        1 --> Chat""");
                break;
            case 4:
                System.out.println("""
                        1 --> Missed calls
                        2 --> Received calls
                        3 --> Dialled numbers
                        4 --> Erase recent call lists
                        5 --> Show call duration
                        6 --> Show call costs
                        7 --> Call cost settings
                        8 --> Prepaid credit""");

                int fuction5 = scanner.nextInt();
                switch (fuction5) {
                    case 5:
                        System.out.println("""
                                1 --> Last call duration
                                2 --> All calls duration
                                3 --> Received calls duration
                                4 --> Dialled calls duration
                                5 --> Clear timers""");
                        break;
                    case 6:
                        System.out.println("""
                                1 --> Last call cost
                                2 --> All calls cost
                                3 --> Clear counters""");
                        break;
                    case 7:
                        System.out.println("""
                                1 --> Call cost limit
                                2 --> Show costs in""");}
            case 5:
                System.out.println("""
                        1 --> Ringing tone
                        2 --> Ringing volume
                        3 --> Incoming call alert
                        4 --> Composer
                        5 --> Message alert tone
                        6 --> Keypad tones
                        7 --> Warning and game tones
                        8 --> Vibrating alert
                        9 --> Screen saver""");
                break;
            case 6:
                System.out.println("""
                        1 --> Call settings
                        2 --> Phone settings
                        3 --> Security settings
                        4 --> Restore factory settings""");

                int fuction1 = scanner.nextInt();
                switch (fuction1) {
                    case 1:
                        System.out.println("""
                                1 --> Automatic redial
                                2 --> Speed dialing
                                3 --> Call waiting options
                                4 --> Own number sending
                                5 --> Phone line in use
                                6 --> Automatic answer""");
                        break;
                    case 2:
                        System.out.println("""
                                1 --> Language
                                2 Cell info display
                                3 --> Welcome note
                                4 --> Network selection
                                5 --> Lights
                                6 --> Confirm SIM service actions""");
                        break;
                    case 3:
                        System.out.println("""
                                1 --> PIN code request
                                2 --> Call barring service
                                3 --> Fixed dialling
                                4 --> Closed user group
                                5 --> Phone security
                                6 --> Change access codes""");
                        break;
                    case 4:
                        System.out.println("""
                                1 --> Restore factory settings """);
                        break;
                }
            case 11:
                System.out.println("""
                        1 --> Alarm clock
                        2 --> Clock settings
                        3 --> Date setting
                        4 --> Stopwatch
                        5 --> Countdown timer
                        6 --> Auto update of date and time""");
                break;





                }

        }


    }
