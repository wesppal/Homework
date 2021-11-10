package by.overone.homeworks;

public class Main {
    public static void main(String[] args) {
        Num<Integer> integerNum = new Num(900000000);
        System.out.println(integerNum.sum(900000000));

        Num<Double> doubleNum = new Num(500000000000000000000000000000000000000000000000000000.0);
        System.out.println(doubleNum.sum(50000000000000.0));

        Num<Float> floatNum = new Num(100000000f);
        System.out.println(floatNum.substraction(2000000f));

        Num<Byte> byteNum = new Num((byte) 128);
        System.out.println(byteNum.substraction((byte) 0));

        Num<Short> shortNum = new Num((short) 2000000000);
        System.out.println(shortNum.sum((short) 2));

        Num<Long> longNum = new Num(9000000000000000000L);
        System.out.println(longNum.sum(9000000000000000000L));
    }
}
