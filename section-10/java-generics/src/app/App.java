package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(4);
        ints.add(8);
        ints.add(16);
        ints.add(32);

        printDoubled(ints);
    }

	private static void printDoubled(ArrayList<Integer> ints) {
        for (Object i : ints) {
            System.out.println((int) i * 2);
        }
	}
}