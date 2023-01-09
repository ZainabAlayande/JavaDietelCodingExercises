package chapterSeven.CheckOutApplication.CreditCardAppication;

import java.util.ArrayList;
import java.util.Scanner;

public class CreditCardApplication {
    private static final Scanner scanner = new Scanner(System.in);
    static int[] digit;
    static ArrayList<Integer> doubledDigit = new ArrayList<>();

    static String userCardNumber;
    static int sum;
    static int sumOfDigitInOddPlaces;

    public static void takeCardNumber() {

        System.out.println("Hello, Kindly enter card details to verify");
        userCardNumber = scanner.next();
        digit = new int[userCardNumber.length()];

        for (int element = 0; element < userCardNumber.length(); element++) {
            digit[element] = Integer.parseInt(String.valueOf(userCardNumber.charAt(element)));
        }


    }




    public static int doubleDigitFromTheBack() {

        int firstNumber = 0;
        int secondNumber = 0;
        int index = 0;

        for (int element = digit.length - 2; element >= 0; element -= 2) {
            doubledDigit.add(index, digit[element] * 2);
            index++;
        }


        for (int element = 0; element < doubledDigit.size(); element++) {
            if (doubledDigit.get(element) > 9) {
                firstNumber = doubledDigit.get(element) / 10;

                secondNumber = doubledDigit.get(element) % 10;

                doubledDigit.remove(element);
                doubledDigit.add(element,firstNumber + secondNumber);
            }
        }

        sum = 0;
        for (int element: doubledDigit) {
            sum = sum + element;
        }
        return sum;
    }



    public static int digitInOddPlaces() {

        sumOfDigitInOddPlaces = 0;

        for (int element = digit.length - 1; element >= 0; element--) {
            if (element % 2 != 0) {
                sumOfDigitInOddPlaces += digit[element];
            }
        }

//        for (int element = 0; element <= digit.length; element++) {
//            if (element % 2 != 0) {
//                sumOfDigitInOddPlaces += digit[element];
//            }
//        }

        return sumOfDigitInOddPlaces;

    }




    public static void checkIfCardIsValid() {

        if ((doubleDigitFromTheBack() + digitInOddPlaces()) % 10 == 0) {
            System.out.println("Valid");
        }

        else if ((doubleDigitFromTheBack() + digitInOddPlaces()) % 10 != 0){
            System.out.println("Invalid");

        }
    }



    public static void typeOfCard() {

        if (digit[0] == 4) {
            System.out.println("Visa Card");
        } else if (digit[0] == 5) {
            System.out.println("Master Card");
        } else if (digit[0] == 3 && digit[1] == 7) {
            System.out.println("American Visa Card");
        } else if (digit[0] == 6) {
            System.out.println("Discover Card");
        } else {
            System.out.println("Invalid Card");
        }

    }


    public static void displayCardDetails () {
        System.out.println();
        System.out.println("******************************************");
        System.out.print("**Credit Card Type: ");
        typeOfCard();
        System.out.println("**Credit Card Number: " + cardNumber());
        System.out.println("**Credit Card Length: " + cardLength());
        System.out.print("**Credit Card Validity Status: ");
        checkIfCardIsValid();
        System.out.println("******************************************");
    }


    public static int cardLength() {

        return digit.length;
    }



    public static String cardNumber() {

        return userCardNumber;
    }


}

