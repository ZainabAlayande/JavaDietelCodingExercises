package chapterSeven.CheckOutApplication;
import ServerClasses.CheckOutAppServer;
public class CheckOutApp {
    public static void main(String[] args) {
        CheckOutAppServer checkOut = new CheckOutAppServer();
        checkOut.displayWelcomeNote();
        checkOut.displayDetails();
        checkOut.displayInvoice();
    }
}