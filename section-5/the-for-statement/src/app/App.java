package app;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("7.359,51 at " + i + "% interest is " + String.format("%.2f", calculateInterest(7359.51, i)));
        for (int i = 10; i < 500; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
            }
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}