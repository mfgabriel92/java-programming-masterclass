package app;

public class App {
    private static final int INVALID_VALUE = -1;

    public static void main(String[] args) throws Exception {
        System.out.println(area(-1, 4));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return INVALID_VALUE;
        }

        return (radius * radius) * Math.PI;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return INVALID_VALUE;
        }

        return x * y;
    }
}