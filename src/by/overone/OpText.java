package by.overone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class OpText {
    public static void repeatingWord(String text, int numberOfLettersInAWord) {
        String[] textArrayWords = text.split("\\s");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < textArrayWords.length; i++) {
            if (hashMap.containsKey(textArrayWords[i])) {
                hashMap.replace(textArrayWords[i], hashMap.get(textArrayWords[i]) + 1);
            } else {
                hashMap.put(textArrayWords[i], 1);
            }
        }
        String str = null;

        int repeat = 0;
        for (String w : hashMap.keySet()) {
            if (w.length() >= numberOfLettersInAWord) {
                if (repeat < hashMap.get(w)) {
                    repeat = hashMap.get(w);
                    str = w;
                }
            }
        }
        System.out.println("Самое повторяющееся слово: " + str + " (встречается " + hashMap.get(str) + " раз)");
    }

    public static void uniqueWord(String text) {
        String[] textArrayWords = text.split("\\s");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < textArrayWords.length; i++) {
            if (hashMap.containsKey(textArrayWords[i])) {
                hashMap.replace(textArrayWords[i], hashMap.get(textArrayWords[i]) + 1);
            } else {
                hashMap.put(textArrayWords[i], 1);
            }
        }
        String str = null;
        Integer min = hashMap.get(textArrayWords[0]);
        for (String words : hashMap.keySet()) {
            if (hashMap.get(words) != null) {
                if (Math.min(min, hashMap.get(words)) <= min) {
                    str = words;
                }
                min = Math.min(min, hashMap.get(words));
            }
        }
        System.out.println("Самое редкое слово: " + str + " (встречается " + hashMap.get(str) + " раз)");
    }

    public static void longWord(String text) {
        String[] textArrayWords = text.split("\\s");
        String temp = textArrayWords[0];
        int max = textArrayWords[0].length();
        for (String str : textArrayWords) {
            if (str.length() >= max) {
                max = Math.max(str.length(), max);
                temp = str;
            }
        }
        System.out.println("Самое длинное слово: " + temp);
    }

    public static List<String> findYears(String text) {
        String[] textArrayWords = text.split("\\s");
        List<String> years = new ArrayList<>();
        for (String str : textArrayWords) {
            if (isDigit(str)) {
                if ((Integer.parseInt(str) > 1000) && (Integer.parseInt(str) < 2021)) {
                    years.add(str);
                }
            }
        }
        return years;
    }

    private static boolean isDigit(String str) throws NumberFormatException {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
