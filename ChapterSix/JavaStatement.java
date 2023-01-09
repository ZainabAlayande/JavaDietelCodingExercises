package ChapterSix;

public class JavaStatement {
    public static void main(String[] args) {

        double a = Math.abs(-7.5);
        double b = Math.floor(5 + 2.5);
        double c = Math.abs(9) + Math.ceil(2.2);
        double d = Math.ceil(-5.2);
        double e = Math.abs(-5) + Math.abs(4);
        double f = Math.ceil(-6.4) - Math.floor(-2.5);
        double g = Math.ceil(-Math.abs(-3 + Math.floor(-2.5)));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);



    }
}
