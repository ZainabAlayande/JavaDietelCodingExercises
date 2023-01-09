package chapterThree;

import tdd.PetrolPurchase;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetrolPurchase nnpc = new PetrolPurchase("lagos", "petrol", 10, 5_000.00, 5.0);

        System.out.println("""
                Welcome to NNPC Filling Station
                           SEE FIRST OUR DEFAULT ATTRIBUTES. THANK YOU
                                        AS YOU JOURNEY WITH US""");
        //System.out.println(nnpc.getLocation());
        //System.out.println(nnpc.getTypeOfPetrol());
        //System.out.println(nnpc.getQuantity());
        //System.out.println(nnpc.getPrice());
        //System.out.println(nnpc.getDiscount());
        //System.out.println(nnpc.getPurchase());

        System.out.println("Enter location of purchase: ");
        String location = scanner.next();

        System.out.println("Enter type of petrol: ");
        String petrolType = scanner.next();

        System.out.println("Enter litres of purchase: ");
        int litres = scanner.nextInt();

        System.out.println("""
                Thank you for providing the necessary information
                                Below is the information you provided
                Additionally, find the price and applicable discount \s""");


        System.out.println();
        System.out.println("SUMMARY OF INFORMATION SUPPLIED");
        System.out.println("Preferred Location is: " + location);
        System.out.println("Preferred Petrol Type is: " + petrolType);
        System.out.println("Amount of Litres is: " + litres);
        System.out.println();

        System.out.println("PRICE DETAILS, DISCOUNT AND PURCHASE PRICE");
        nnpc.setPrice(987);
        System.out.println("Price is: " + nnpc.getPrice());
        System.out.println("Discount is: " + nnpc.getDiscount());
        System.out.println("Purchase Price is: " + nnpc.getPurchase());
        System.out.println();

        System.out.println("Please enter the purchase price now");
        double purchasePrice = scanner.nextDouble();

        System.out.println("""
                                THANK YOU!\s
                         YOU MAY HAVE YOUR PETROL NOW
                         THANK YOU FOR YOUR PATRONAGE""");



    }
}
