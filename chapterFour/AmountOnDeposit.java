package chapterFour;

public class AmountOnDeposit {
    public static void main(String[] args) {

        //for(int counter = 1; counter <= 10; counter++)
        //for (int j = 2; j <= 80; j += 5)
          //for (int i = 100; i >= 1; i--)
            //System.out.println(i);

        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%25s%n","Year", "Amount on deposit");
        for (int year = 1; year <= 10; year++){
            double amount = principal * Math.pow(1.0 + rate , year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}