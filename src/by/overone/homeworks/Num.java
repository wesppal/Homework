package by.overone.homeworks;

public class Num<A extends Number> {

    private A value;

    public Num(A value) {
        this.value = value;
    }


    public A sum(A added) {
        Double sum = value.doubleValue() + added.doubleValue();
        if (value instanceof Integer){
            return (A)(Integer)sum.intValue();
        }
        if (value instanceof Short){
            return (A)(Short)sum.shortValue();
        }
        if (value instanceof Long){
            return (A)(Long)sum.longValue();
        }

        return (A) sum;
    }


    @Override
    public String toString() {
        return "value=" + value;
    }

}
