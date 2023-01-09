package chapterTwo;

public class QuickCalculation {
    public static void main(String[] args) {

        int a = 1000000000/1440;
        int b = a % 365;
        int c = 1000000000/1440%365;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
