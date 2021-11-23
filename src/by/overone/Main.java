package by.overone;

import java.io.*;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String link = "https://raw.githubusercontent.com/wesppal/Homework/homework_27/src/by/overone/War_and_peace_Leo_Tolstoy.txt";

        File out = new File("src/by/overone/War_and_peace_Leo_Tolstoy.txt");

        new Thread(new Download(link,out)).start();


        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(out), "UTF-8");
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
            inputStreamReader.close();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл только скачался.Для корректной работы запустите ещё раз программу.");
        }


        File file = new File("person.txt");
        File file1 = new File("temp.txt");
        if (!file.exists()){
            Person natalRost = new Person("Natalia","Rostova");
            Person andrBolc = new Person("Andrey","Bolconskiy");
            Person pierBez = new Person("Pier","Bezuhov");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(natalRost);
            oos.writeObject(andrBolc);
            oos.writeObject(pierBez);
            ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(file1));
            oos1.writeObject(natalRost.toString());
            oos1.writeObject(andrBolc.toString());
            oos1.writeObject(pierBez.toString());
            oos.close();
            oos1.close();
        } else {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            Person restoredNatalRost = (Person) ois.readObject();
            System.out.println(restoredNatalRost.toString());
            Person restoredAndrBolc = (Person) ois.readObject();
            System.out.println(restoredAndrBolc.toString());
            Person restoredPierBez = (Person) ois.readObject();
            System.out.println(restoredPierBez.toString());
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file1));
            oos.writeObject(restoredAndrBolc.toString());
            oos.writeObject(restoredNatalRost.toString());
            oos.writeObject(restoredPierBez.toString());
            Person test = new Person("Klava","Kooka");
            oos.writeObject(test.toString());
            ois.close();
            oos.close();
        }
    }
}
