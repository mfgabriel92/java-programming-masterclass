package app;

public class App {
    public static void main(final String[] args) throws Exception {
        final int minValue = Integer.MIN_VALUE;
        final int maxValue = Integer.MAX_VALUE;

        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
        System.out.println("Max value busted: " + (maxValue + 1));
        System.out.println("Min value busted: " + (minValue - 1));
        
        int maxValue2 = 2_147_483_647;
        System.out.println("Max value 2 busted: " + (maxValue2 + 1));
    }
}