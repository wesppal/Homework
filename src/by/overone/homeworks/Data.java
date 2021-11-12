package by.overone.homeworks;


public enum Data {
    JANUARY("Январь", 1, 31), FEBRUARY("Февраль", 2, 29),
    MARCH("Март", 3, 31), APRIL("Апрель", 4, 30),
    MAY("Май", 5, 31), JUNE("Июнь", 6, 30),
    JULY("Июль", 7, 31), AUGUST("Авгус", 8, 31),
    SEPTEMBER("Сентябрь", 9, 30), OCTOBER("Октябрь", 10, 31),
    NOVEMBER("Ноябрь", 11, 30), DECEMBER("Декабрь", 12, 31);

    int days;
    int month;
    String rusName;

    Data(String rusName, int month, int days) {
        this.days = days;
        this.month = month;
        this.rusName = rusName;
    }

    public static void checkData(int day, int month) {

        try {
            if ((day < 1) || (day > values()[month - 1].days)) {
                System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                        + values()[month - 1].rusName + ", количество дней в нём - " + values()[month - 1].days + ".");
            }
        }
        catch (Exception e) {
            if ((month < 1) || (month > 12)) {
                System.out.println("Такого месяца нет. Проверьте введённые данные. Месяц в формате от 1 до 12.");
            }
        }

    }
}
