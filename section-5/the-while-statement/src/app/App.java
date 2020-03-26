package app;

public class App {
    public static void main(String[] args) throws Exception {
        // while (count <= 5) {
        //     System.out.println("Count: " + count);
        //     count++;
        // }
        
        // count = 1;

        // while (true) {
        //     if (count <= 5) {
        //         break;
        //     }

        //     System.out.println("Count: " + count);
        //     count++;
        // }

        // do {
        //     System.out.println("Count: " + count);
        //     count++;
        // } while (count <= 5);
        int n = 1;
        int evens = 0;

        while (n <= 100) {
            n++;

            if (!isEven(n)) {
                continue;
            }

            evens++;

            if (evens > 5) {
                break;
            }

            System.out.println("The even number: " + n);
        }

        System.out.println("Number of evens: " + evens);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}