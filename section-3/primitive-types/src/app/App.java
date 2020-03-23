package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-------");
        System.out.println("Integer");
        System.out.println("-------");
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
        // System.out.println("Max value busted: " + (maxValue + 1));
        // System.out.println("Min value busted: " + (minValue - 1));
        
        // int maxValue2 = 2_147_483_647;
        // System.out.println("Max value 2 busted: " + (maxValue2 + 1));

        // ------ //
        System.out.println("----");
        System.out.println("Byte");
        System.out.println("----");
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println("Min byte value: " + minByteValue);
        System.out.println("Max byte value: " + maxByteValue);

        // ------ //
        System.out.println("----");
        System.out.println("Short");
        System.out.println("----");
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        System.out.println("Min byte value: " + minShortValue);
        System.out.println("Max byte value: " + maxShortValue);

        // ------ //
        System.out.println("----");
        System.out.println("Long");
        System.out.println("----");
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        System.out.println("Min long value: " + minLongValue);
        System.out.println("Max long value: " + maxLongValue);

        int castedIntValue = (minValue / 2);
        byte castedByteValue = (byte) (minByteValue / 2);
        short castedShortValue = (short) (minShortValue / 2);
        long castedLongValue = (long) (minLongValue / 2);
    }
}