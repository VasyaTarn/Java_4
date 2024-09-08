package Wrappers;

public class WrapperTest {
    public static void main(String[] args) {


        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10);
        Integer i3 = new Integer(10);
        Integer i4 = Integer.parseInt("10");

        Double d1 = 10.5;

        byte b = d1.byteValue();
        short s = d1.shortValue();
        int i = d1.intValue();
        float f = d1.floatValue();
        long l = d1.longValue();

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Float: " + f);
        System.out.println("Long: " + l);

        Double nonZeroValue = 5.0;
        Double zeroValue = 0.0;

        Double nanValue = nonZeroValue / zeroValue;
        Double infinityValue = zeroValue / zeroValue;

        System.out.println("nanValue: " + nanValue);
        System.out.println("infinityValue: " + infinityValue);

        if (nanValue.isNaN()) {
            System.out.println("Переменная nanValue = NaN");
        }
        if (infinityValue.isNaN()) {
            System.out.println("Переменная infinityValue = NaN");
        }
        if (nanValue.isInfinite()) {
            System.out.println("Переменная nanValue = Infinity");
        }
        if (infinityValue.isInfinite()) {
            System.out.println("Переменная infinityValue = Infinity");
        }

        Long long1 = 120L;
        Long long2 = 120L;
        System.out.println("Comparison result for 120L: " + (long1 == long2));

        long1 = 1200L;
        long2 = 1200L;
        System.out.println("Comparison result for 1200L: " + (long1 == long2));
    }
}
