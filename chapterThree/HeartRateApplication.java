package chapterThree;

import tdd.HeartRates;

import java.util.Scanner;

public class HeartRateApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HeartRates heartrate = new HeartRates("Felix", "Okorocha", "29/06/1999");

        System.out.println(heartrate.getFirstName());
        System.out.println(heartrate.getLastName());
        System.out.println(heartrate.getDateOfBirth());
        System.out.println(heartrate.calculateAgeInYears(2022, 23));
        System.out.println(heartrate.calculateMaximumHeartRate(23));
        System.out.printf("Your heart rate is between %.1f and %.2f",heartrate.checkTargetHeartRate(23), heartrate.checkSecondTargetHeartRate(23));

    }
}
