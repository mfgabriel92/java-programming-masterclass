package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(divideLBYL(10, 0));
        System.out.println(divideEAFP(10, 0));
    }

    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        }

        return 0;
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}