package by.overone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class OpText {
    public static void repeatingWord(String text, int numberOfLettersInAWord) {
        String[] textArrayWords = text.split("\\s");
        HashMap<String, Integer> h = new HashMap<>();
        for (int i = 0; i < textArrayWords.length; i++) {
            if (h.containsKey(textArrayWords[i])) {
                h.replace(textArrayWords[i], h.get(textArrayWords[i]) + 1);
            } else {
                h.put(textArrayWords[i], 1);
            }
        }
        String s = null;
        int p = 0;
        for (String w : h.keySet()) {
            if (w.length() >= numberOfLettersInAWord) {
                if (p < h.get(w)) {
                    p = h.get(w);
                    s = w;
                }
            }
        }
        System.out.println("Самое повторяющееся слово: " + s + " (встречается " + h.get(s) + " раз)");
    }

    public static void uniqueWord(String text) {
        String[] textArrayWords = text.split("\\s");
        HashMap<String, Integer> h = new HashMap<>();
        for (int i = 0; i < textArrayWords.length; i++) {
            if (h.containsKey(textArrayWords[i])) {
                h.replace(textArrayWords[i], h.get(textArrayWords[i]) + 1);
            } else {
                h.put(textArrayWords[i], 1);
            }
        }
        String s = null;
        Integer min = h.get(textArrayWords[0]);
        for (String w : h.keySet()) {
            if (h.get(w) != null) {
                if (Math.min(min, h.get(w)) <= min) {
                    s = w;
                }
                min = Math.min(min, h.get(w));
            }
        }
        System.out.println("Самое редкое слово: " + s + " (встречается " + h.get(s) + " раз)");
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

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
