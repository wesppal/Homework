package by.overone.homeworks;

public class Main {
    public static void main(String[] args) {
        Num<Integer> integerNum = new Num(5);
        System.out.println(integerNum.sum(5));
        Num<Double> doubleNum = new Num(5.0);
        System.out.println(doubleNum.sum(5.0));
        Num<Float> floatNum = new Num(1f);
        System.out.println(floatNum.sum(2f));
        Num<Byte> byteNum = new Num((byte) 1);
        System.out.println(byteNum.sum((byte) 1));
        Num<Short> shortNum = new Num((short) 2);
        System.out.println(shortNum.sum((short) 2));
        Num<Long> longNum = new Num(9000000000000000000L);
        System.out.println(longNum.sum(9000000000000000000L));
    }
}
