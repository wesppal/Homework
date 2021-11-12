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
        if ((month < 1) || (month > 12)) {
            System.out.println("Такого месяца нет. Проверьте введённые данные. Месяц в формате от 1 до 12.");
        }
        switch (month) {
            case 1:
                if ((day < 1) || (day > JANUARY.days)) {
                    System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                            + JANUARY.rusName + ", количество дней в нём - " + JANUARY.days + ".");
                }
                break;
            case 2:
                if ((day < 1) || (day > FEBRUARY.days)) {
                    System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                            + FEBRUARY.rusName + ", количество дней в нём - " + FEBRUARY.days + ".");
                }
                break;
            case 3:
                if ((day < 1) || (day > MARCH.days)) {
                    System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                            + MARCH.rusName + ", количество дней в нём - " + MARCH.days + ".");
                }
                break;
            case 4:
                if ((day < 1) || (day > APRIL.days)) {
                    System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                            + APRIL.rusName + ", количество дней в нём - " + APRIL.days + ".");
                }
                break;
            case 5:
                if ((day < 1) || (day > MAY.days)) {
                    System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                            + MAY.rusName + ", количество дней в нём - " + MAY.days + ".");
                }
                break;
            case 6:
                if ((day < 1) || (day > JUNE.days)) {
                    System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                            + JUNE.rusName + ", количество дней в нём - " + JUNE.days + ".");
                }
                break;
            case 7:
                if ((day < 1) || (day > JULY.days)) {
                    System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                            + JULY.rusName + ", количество дней в нём - " + JULY.days + ".");
                    break;
                }
            case 8:
                if ((day < 1) || (day > AUGUST.days)) {
                    System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                            + AUGUST.rusName + ", количество дней в нём - " + AUGUST.days + ".");
                    break;
                }
            case 9:
                if ((day < 1) || (day > SEPTEMBER.days)) {
                    System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                            + SEPTEMBER.rusName + ", количество дней в нём - " + SEPTEMBER.days + ".");
                    break;
                }
            case 10:
                if ((day < 1) || (day > OCTOBER.days)) {
                    System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                            + OCTOBER.rusName + ", количество дней в нём - " + OCTOBER.days + ".");
                    break;
                }
            case 11:
                if ((day < 1) || (day > NOVEMBER.days)) {
                    System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                            + NOVEMBER.rusName + ", количество дней в нём - " + NOVEMBER.days + ".");
                    break;
                }
            case 12:
                if ((day < 1) || (day > DECEMBER.days)) {
                    System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                            + DECEMBER.rusName + ", количество дней в нём - " + DECEMBER.days + ".");
                    break;
                }
        }
    }
}
