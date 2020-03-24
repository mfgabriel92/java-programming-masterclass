package app;

public class App {
    public static void main(String[] args) throws Exception {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = result = " + previousResult);

        result = result - 1;
        System.out.println("result - 1 = " + result);

        result = result * 10;
        System.out.println("result * 10 = " + result);

        result = result / 5;
        System.out.println("result / 5 = " + result);

        result = result % 3;
        System.out.println("result % 3 = " + result);
    }
}