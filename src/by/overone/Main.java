package by.overone;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/Учёба Java/Homework/src/by/overone/Толстой-Лев.-Война-и-мир.Том-1-и-2.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "UTF-8");
        BufferedReader reader = new BufferedReader(inputStreamReader);
        int ch;
        StringBuilder builder = new StringBuilder();

        while ((ch = reader.read()) != -1) {
            builder.append((char) ch);
        }
        System.out.println(builder);


    }
}
