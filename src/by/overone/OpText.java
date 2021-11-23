package by.overone;

import java.util.HashMap;


public class OpText {
    public static void repeatingWord(String text, int numberOfLettersInAWord) {
        String[] textArrayWords = text.split(" ");
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
}
