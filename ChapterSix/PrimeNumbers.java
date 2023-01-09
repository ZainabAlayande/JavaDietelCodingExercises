package ChapterSix;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.println("Enter a number ");
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        primeNumberCalculation(number);
    }

    static void primeNumberCalculation(int num)
    {
        int count=0;
        for(int index = 1; index <= num; index++)
        {
            if(num % index==0)
            {
                count++;
            }
        }
        if(count==2)
            System.out.println("prime number ");
        else
            System.out.println("Not a prime number ");
    }


}






