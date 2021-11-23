package by.overone;

import java.io.*;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/Учёба Java/Homework/src/by/overone/Толстой Лев. Война и мир. Том 1 и 2.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "UTF-8");
        BufferedReader reader = new BufferedReader(inputStreamReader);
        int ch;
        StringBuilder text = new StringBuilder();

        while ((ch = reader.read()) != -1) {
            text.append((char) ch);
        }
        System.out.println(text);

//        File tempFile = new File("tempTxt.txt");

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
    }
}
