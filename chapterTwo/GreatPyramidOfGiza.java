package chapterTwo;

import java.util.Scanner;

public class GreatPyramidOfGiza {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Estimated number of stones used: ");
        double estimatedNumberOfStones = scanner.nextDouble();

        System.out.print("Enter Average weight of each stone: ");
        double averageWeightOfEachStone = scanner.nextDouble();

        System.out.print("Enter Number of Years Taken to Build the Pyramid: ");
        double numberOfYearsInBuildingThePyramid = scanner.nextDouble();

        double totalWeightOfThePyramid = 5.75;

        double yearlyEstimate = (totalWeightOfThePyramid/numberOfYearsInBuildingThePyramid) * 12;
        double estimatePerHour = yearlyEstimate / 24;
        double estimatePerMinute = estimatePerHour / 60;

        System.out.println();

        System.out.println("Yearly Estimate of Building the Great Pyramid of Giza is --> " + yearlyEstimate);
        System.out.println("Hourly Estimate of Building the Great Pyramid of Giza is --> " + estimatePerHour);
        System.out.println("Estimate Per Minute of Building the Great Pyramid of Giza is --> " + estimatePerMinute);

    }
}
