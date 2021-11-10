package by.overone.homeworks;

public class Num<A extends Number> {

    private A value;

    public Num(A value) {
        if (universalCheck(value) == false) {
            this.value = value;
        } else {
            System.out.println("Error.");
        }

    }


    public A sum(A added) {
        Double sum = value.doubleValue() + added.doubleValue();
        return universalTransform(value, sum);
    }

    public A substraction(A deduct) {
        Double result = value.doubleValue() - deduct.doubleValue();
        if (universalCheck(deduct)){
            if (universalCheck((A)result)){

            }
        }
        return universalTransform(value, result);
    }


    private A universalTransform(A value, Double result) {
        if (value instanceof Integer) {
            return (A) (Integer) result.intValue();
        }
        if (value instanceof Short) {
            return (A) (Short) result.shortValue();
        }
        if (value instanceof Long) {
            return (A) (Long) result.longValue();
        }
        if (value instanceof Byte) {
            return (A) (Byte) result.byteValue();
        }
        if (value instanceof Float) {
            return (A) (Float) result.floatValue();
        }
        return (A) result;
    }

    private boolean universalCheck(A value) {
        if (value instanceof Byte) {
            if ((value.byteValue() < Byte.MIN_VALUE) || (value.byteValue() > Byte.MAX_VALUE) || (value == null)) {
                System.out.println("Sorry, out of bounds");
            }
            return ((value.byteValue() < Byte.MIN_VALUE) || (value.byteValue() > Byte.MAX_VALUE) || (value == null));
        }

        if (value instanceof Short) {
            if ((value.shortValue() < Short.MIN_VALUE) || (value.shortValue() > Short.MAX_VALUE)) {
                System.out.println("Sorry, out of bounds");
            }
            return ((value.shortValue() < Short.MIN_VALUE) || (value.shortValue() > Short.MAX_VALUE));
        }

        if (value instanceof Integer) {
            if ((value.intValue() < Integer.MIN_VALUE) || (value.intValue() > Integer.MAX_VALUE)) {
                System.out.println("Sorry, out of bounds");
                return ((value.intValue() < Integer.MIN_VALUE) || (value.intValue() > Integer.MAX_VALUE));
            }
        }

        if (value instanceof Long) {
            if ((value.longValue() < Long.MIN_VALUE) || (value.longValue() > Long.MAX_VALUE)) {
                System.out.println("Sorry, out of bounds");
                return ((value.longValue() < Long.MIN_VALUE) || (value.longValue() > Long.MAX_VALUE));
            }
        }

        if (value instanceof Float) {
            if ((value.floatValue() < Float.MIN_VALUE) || (value.floatValue() > Float.MAX_VALUE)) {
                System.out.println("Sorry, out of bounds");
                return ((value.floatValue() < Float.MIN_VALUE) || (value.floatValue() > Float.MAX_VALUE));
            }
        }

        if (value instanceof Double) {
            if ((value.doubleValue() < Double.MIN_VALUE) || (value.doubleValue() > Double.MAX_VALUE)) {
                System.out.println("Sorry, out of bounds");
                return ((value.doubleValue() < Double.MIN_VALUE) || (value.doubleValue() > Double.MAX_VALUE));
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "value=" + value;
    }

}
