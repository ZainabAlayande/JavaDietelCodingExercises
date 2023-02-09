package MoyinSnacks;
import java.util.ArrayList;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Enter an integer to determine the binary number: ");
        int number = scanner.nextInt();
        int temp = number;
        int remainder;
        int index = 0;

        while (!(number == 0)) {
            remainder = number % 2;
            array.add(index, remainder);
            number = number/2;
            index++;
        }



        System.out.println();
        System.out.println();
        System.out.print("Binary number of " + temp + " is -> ");
        for (int i = array.size() - 1; i > 0; i--) {
            System.out.print(array.get(i));
        }

    }
}
