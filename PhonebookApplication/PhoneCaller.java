package ChapterEight.PhonebookApplication;
import javax.swing.*;
import java.util.Scanner;
public class PhoneCaller {
    static Scanner keyboardInputCollector = new Scanner(System.in);
    static Phonebook phonebook = new Phonebook();

    public static void main(String[] args) {
        falseCallerAppDisplay();
        callLogs();
    }

    private static void falseCallerAppDisplay() {
        display("""
                ----------------------------------------------
                F   A   L   S   E  -    C   A   L   L   E   R
                ----------------------------------------------
                """);
    }

    private static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
        //display(prompt);
        //return keyboardInputCollector.nextLine();

    }
    private static void display(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
        //System.out.println(prompt);
    }

    private static void callLogs() {
        display("""
                -------------------------------------------
                     You have 7 missed call
                              and
                            2 messages.\040\040\040\040\040\040\040\040
                -------------------------------------------""");
       String previewMissedCall = input("""
                Click 1 -> to view missed call
                Click 2 -> to view message
                Click 3 -> to to go to the main menu""");
       display("");

        switch (previewMissedCall) {
            case "1" -> {
                displayMissedCalls();
                goToMainMenu();
                break;
            }

            case "2" -> displayMessages();
            default -> goToMainMenu();

        }
    }


    private static void goToMainMenu() {
        String userInput = input("""
                ------------------------
                1 <---> save contact
                2 <---> edit contact
                3 <---> view contact with name
                4 <---> view contact with phone number
                5 <---> count contact
                6 <---> delete contact
                7 <---> view call log
                8 <---> view all contacts
                9 <---> exit"""
        );

        switch (userInput){
            case "1":
                saveContact();
            case "2":
                editTheContact();
            case "3":
                viewContactWithName();
            case "4":
                viewContactWithPhoneNumber();
            case "5":
                countContact();
            case "6":
                deleteContact();
            case  "7" :
                callLogs();
            case "8":
                viewAllContacts();
            case "9":
                exitFalseCaller();
            default:
                goToMainMenu();
        }
    }

    private static void viewAllContacts() {
        phonebook.viewAllContacts();
        goToMainMenu();
    }

    private static void countContact() {
        display("Total Contact is: " + phonebook.countContact());
        goToMainMenu();
    }

    private static void exitFalseCaller() {
        display("""
                --------------------------------
                Thank you for using False Caller""");

        display("""
                --------------------------------
                    False Caller locked
                --------------------------------""");
        System.exit(1);
    }

    private static void deleteContact() {
        try {
            String nameToBeDeleted = input("Enter name to be delete: ");
            phonebook.validateThatEmptyStringCanNotBreakCode(nameToBeDeleted);
            phonebook.deleteContactByName(nameToBeDeleted);

            display("Successfully deleted");
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        goToMainMenu();
    }

    private static void viewContactWithPhoneNumber() {
        try {
            String viewContactWithPhoneNumber = input("Enter contact to be viewed with phone number: ");
            phonebook.validateThatEmptyStringCanNotBreakCode(viewContactWithPhoneNumber);
            phonebook.viewContactWithPhoneNumber(viewContactWithPhoneNumber);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        goToMainMenu();
    }

        private static void editTheContact() {
        try {
            String nameToEdit = input("Enter name to edit: ");
            phonebook.validateThatEmptyStringCanNotBreakCode(nameToEdit);

            String newNameToEdit = input("Enter new name to edit: ");
            phonebook.validateThatEmptyStringCanNotBreakCode(nameToEdit);

            phonebook.editContact(nameToEdit, newNameToEdit);

            display("Succesfully edited");
            display("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        goToMainMenu();
    }

        private static void viewContactWithName() {
        try {
            String viewName = input("Enter name to be viewed: ");
            phonebook.validateThatEmptyStringCanNotBreakCode(viewName);
            phonebook.viewContactWithName(viewName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

            goToMainMenu();
    }

    private static void saveContact() {
        display("");
        try {
            String name = input("Enter name: ");
            phonebook.validateThatEmptyStringCanNotBreakCode(name);
            display("");

            String phoneNumber = input("Add phoneNumber");
            phonebook.validateThatEmptyStringCanNotBreakCode(phoneNumber);
            display("");

            String address = input("Enter address");
            phonebook.validateThatEmptyStringCanNotBreakCode(address);
            display("");

            String emailAddress = input("Add email address");
            phonebook.validateThatEmptyStringCanNotBreakCode(emailAddress);
            display("");
            phonebook.addContact(name, phoneNumber, address, emailAddress);

            display("You just save a new contact");
            display("");
        } catch (Exception e) {
            display(e.getMessage());        }
        goToMainMenu();
    }

    private static void displayMessages() {
        display("");
        display("""
                --------------------------
                Credit: 120000000000000000 💲
                Bank: Ciroma Bk            💵
                Date: 12/02/2023           💰
                Receiver: Bullion Dept     🤑

                --------------------------
                Debit: 120000000000000000 🤑
                Bank: Ciroma Bk            💰
                Date: 12/02/2023           💰
                Receiver: Bullion Dept     💲""");

        String userChoice = input("Whats Next? \n" +
                "1 --> View Call Log Again\n" +
                "2 --> Go to main menu\n");
        display("");
        switch (userChoice) {
            case "1":
                callLogs();
            case "2":
                goToMainMenu();
        }
    }

    private static void displayMissedCalls() {
        display("""
                ---------------------------
                📞 Bola Ahmed Tinubu - 12:00am
                📞 Lai Muhammad - 12:50am
                📞 Abubakar Atiku - 1:30am
                📞 Dino Melaye - 2:50am
                📞 Muhammad Buhari - 3:00am
                📞 Reno Omokri - 3:30am
                📞 Regha Daniel - 4:00 am
                """);

        display("""
                You dont have to call back if you don't want 
                        your life to be destroyed
                        
                Please call any of them back, if you conceive
                        to be like them 😄😄😄😄
                          Iku pa e!!! 🤪🤪🤪🤪
                """);
    }
}
