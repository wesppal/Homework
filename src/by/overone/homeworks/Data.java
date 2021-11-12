package by.overone.homeworks;


import java.util.ArrayList;
import java.util.List;

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

    private static class Zodiac {
        int sinceDay;
        int sinceMonth;
        int endDay;
        int endMonth;
        String rusName;
        static List<Zodiac> allZodiac = new ArrayList<>();


        Zodiac(int sinceDay, int sinceMonth, int endDay, int endMonth, String rusName) {
            this.sinceDay = sinceDay;
            this.sinceMonth = sinceMonth;
            this.endDay = endDay;
            this.endMonth = endMonth;
            this.rusName = rusName;
        }

        static {
            Zodiac aries = new Zodiac(21, 3, 20, 4, "Овен");
            allZodiac.add(aries);
            Zodiac taurus = new Zodiac(21, 4, 20, 5, "Телец");
            allZodiac.add(taurus);
            Zodiac gemini = new Zodiac(21, 5, 21, 6, "Близнецы");
            allZodiac.add(gemini);
            Zodiac cancer = new Zodiac(22, 6, 22, 7, "Рак");
            allZodiac.add(cancer);
            Zodiac leo = new Zodiac(23, 7, 23, 8, "Лев");
            allZodiac.add(leo);
            Zodiac virgo = new Zodiac(24, 8, 23, 9, "Дева");
            allZodiac.add(virgo);
            Zodiac libra = new Zodiac(24, 9, 23, 10, "Весы");
            allZodiac.add(libra);
            Zodiac scorpio = new Zodiac(24, 10, 22, 11, "Скорпион");
            allZodiac.add(scorpio);
            Zodiac sagittarius = new Zodiac(23, 11, 21, 12, "Стрелец");
            allZodiac.add(sagittarius);
            Zodiac capricorn = new Zodiac(22, 12, 20, 1, "Козерог");
            allZodiac.add(capricorn);
            Zodiac aquarius = new Zodiac(21, 1, 20, 2, "Водолей");
            allZodiac.add(aquarius);
            Zodiac pisces = new Zodiac(21, 2, 20, 3, "Рыбы");
            allZodiac.add(pisces);

        }
    }


    public static boolean checkData(int day, int month) {

        try {
            if ((day < 1) || (day > values()[month - 1].days)) {
                System.out.println("В этом месяце нет такой даты. Проверьте введённый данные. Ваш месяц - "
                        + values()[month - 1].rusName + ", количество дней в нём - " + values()[month - 1].days + ".");
            }
            return true;
        } catch (Exception e) {
            if ((month < 1) || (month > 12)) {
                System.out.println("Такого месяца нет. Проверьте введённые данные. Месяц в формате от 1 до 12.");
            }
        }
        return false;
    }


    public static void outZodiac(int day, int month) {
        if (checkData(day, month)) {
            for (Zodiac zodiac : Zodiac.allZodiac) {
                if ((day > zodiac.sinceDay) && (month == zodiac.sinceMonth) && (day <= Data.values()[month - 1].days)
                    ||(day <= zodiac.endDay) && (month == zodiac.endMonth) && (day > 0)){
                    System.out.println("Ваш знак зодиака - " + zodiac.rusName + ".");
                }
            }
        }
    }
}
