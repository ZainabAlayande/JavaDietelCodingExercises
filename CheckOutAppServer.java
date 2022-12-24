package CheckOutApplication;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutAppServer {
    private static final Scanner scanner = new Scanner(System.in);
    String customerName;
    String more;
    double discount;
    String cashierName;

    ArrayList<String> iteratorBucket = new ArrayList<>(50);
    ArrayList<String> items = new ArrayList<>(50);
    ArrayList<Double> price = new ArrayList<>(50);
    ArrayList<Integer> quantity = new ArrayList<>(50);
    ArrayList<Double> total = new ArrayList<>(50);
    double subTotal = 0;
    int amountPaid;


    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();


    public void displayWelcomeNote() {
        System.out.print("*****************************************************\n");
        System.out.print("******* WELCOME TO SEMICOLON E-COMMERCE STORE *******\n");
        System.out.print("*****************************************************\n");
        System.out.println();
    }


    public void displayDetails() {
        System.out.println("What is the customer's Name");
        customerName = scanner.nextLine();

        System.out.println("What did the customer buy?");
        items.add(scanner.next());

        System.out.println("How many pieces?");
        quantity.add(scanner.nextInt());

        System.out.println("How much per unit?");
        price.add(scanner.nextDouble());

        System.out.println("Add more items (Yes/No)");
        more = scanner.next();

        while (more.equalsIgnoreCase("Yes")){
            secondDisplay();

            if (more.equalsIgnoreCase("no"))
                informationFromCashier();
        }
    }




    public void secondDisplay() {

            System.out.println("What did the customer buy?");
            items.add(scanner.next());

            System.out.println("How many pieces?");
            quantity.add(scanner.nextInt());

            System.out.println("How much per unit?");
            price.add(scanner.nextDouble());

            System.out.println("Add more items (Yes/No)");
            more = scanner.next();

    }


    public void informationFromCashier() {
        System.out.println("What is the Cashier's first name?");
        cashierName = scanner.next();

        System.out.println("How much discount will customer get?");
        discount = scanner.nextDouble();
    }


    public void displayInvoice(){
        System.out.println();
        System.out.println("Preparing Invoice.............");
        System.out.println();
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS.");
        System.out.println("TEL:  03293828343");
        System.out.println("Date:  " + date + " " + time);
        System.out.println("Cashier:  " + cashierName);
        System.out.println("Customer's Name:  " + customerName);
        System.out.println("=====================================================================");
        System.out.printf("%20s%15s%15s%20s%n", "ITEMS", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("---------------------------------------------------------------------");


        for (int element = 0; element < items.size(); element++) {
            total.add(quantity.get(element) * price.get(element));
            subTotal = subTotal + total.get(element);
            System.out.printf("%20s%15s%15s%20s%n", items.get(element), quantity.get(element), price.get(element), total.get(element));
        }


        System.out.println("---------------------------------------------------------------------");
        System.out.println("                           Sub Total: " + subTotal);
        System.out.println("                            Discount: " + getDiscount()               );
        System.out.println("                        VAT @ 17.50%: " + getVat()                    );
        System.out.println("=====================================================================");
        System.out.println("                          Bill Total: " + billTotal()                 );
        System.out.println("=====================================================================");
        System.out.println("                  THIS IS NOT A RECEIPT KINDLY PAY " + billTotal()    );
        System.out.println("=====================================================================");


        System.out.println();
        System.out.println();

        System.out.println("How much did the customer give to you?");
        amountPaid = scanner.nextInt();

        System.out.println();
        System.out.println();

        System.out.println("Preparing Receipt.............");

        System.out.println();
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS.");
        System.out.println("TEL:  03293828343");
        System.out.println("Date:  " + date + " " + time);
        System.out.println("Cashier:  " + cashierName);
        System.out.println("Customer's Name:  " + customerName);
        System.out.println("=====================================================================");
        System.out.printf("%20s%15s%15s%20s%n", "ITEMS", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("---------------------------------------------------------------------");

        for (int element = 0; element < items.size(); element++) {
            total.add(quantity.get(element) * price.get(element));
            //sum = sum + total.get(element);
            System.out.printf("%20s%15s%15s%20s%n", items.get(element), quantity.get(element), price.get(element), total.get(element));
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.println("                            Sub Total: " + subTotal);
        System.out.println("                             Discount: " + getDiscount()              );
        System.out.println("                          VAT @ 17.50: " + getVat()                   );
        System.out.println("=====================================================================");
        System.out.println("                           Bill Total: " + billTotal()                );
        System.out.println("                          Amount Paid: " + amountPaid                 );
        System.out.println("                              Balance: " + balance());
        System.out.println("=====================================================================");
        System.out.println("                     THANK YOU FOR YOUR PATRONAGE                    ");
        System.out.println("=====================================================================");

    }


    public double getDiscount(){
        return discount/100 * subTotal;
    }

    private double getVat() {
        double vat = 17.50;
        return (vat/100) * subTotal;
    }

    private double billTotal() {
        return subTotal + (getVat() -  getDiscount());
    }

    private double balance() {
        return amountPaid - billTotal();
    }


}
