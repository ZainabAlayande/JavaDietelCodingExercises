package chapterFive;

public class MethodTest {
    public static void main(String[] args) {

        String test1 = Test1("A");
        String test2 = Test2("B");
        String test3 =Test3("C");
        String test4 = Test4("D");
        System.out.print(test1 + "  " + test2 + "  " + test3 + "  " + test4);

    }

    private static String Test1(String  letterA){
        return letterA;
    }

    private static String Test2(String  letterB){
        return letterB;
    }

    private static String Test3(String  letterC){
        return letterC;
    }

    private static String Test4(String  letterD){
        return letterD;
    }
}
