package by.overone;

import java.io.*;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        String link = "https://raw.githubusercontent.com/wesppal/Homework/homework_27/src/by/overone/War_and_peace_Leo_Tolstoy.txt";

        File out = new File("src/by/overone/War_and_peace_Leo_Tolstoy.txt");

        new Thread(new Download(link,out)).start();

        File file = new File("D:/Учёба Java/Homework/src/by/overone/War_and_peace_Leo_Tolstoy.txt");
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "UTF-8");
            BufferedReader reader = new BufferedReader(inputStreamReader);
            int ch;
            StringBuilder text = new StringBuilder();

            while ((ch = reader.read()) != -1) {
                text.append((char) ch);
            }
            System.out.println(text);

            OpText.repeatingWord(text.toString(), 5);
            OpText.uniqueWord(text.toString());
            OpText.longWord(text.toString());
            List<String> years = OpText.findYears(text.toString());
            System.out.println("Количество встречающихся упоминаний годов в тексте - " + years.size()
                    + ". Упомянутые годы:");
            if (years.size() == 0) {
                System.out.println("не встеритось");
            }

            TreeSet<String> yearsSet = new TreeSet<>(years);
            for (String s : yearsSet) {
                System.out.print(s + "; ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл только скачался.Для корректной работы запустите ещё раз программу.");
        }
    }
}
