package by.overone.homeworks;

public class StrClass {

    public static int amountWordsInLine(String str) {
        int amount = 0;
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                amount++;
            }
        }
        return ++amount;
    }

    public static String editLine(String str) {
        str = str.trim();
        StringBuilder newStr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == 'a') {
                ch = '%';
            }
            newStr.append(ch);
        }
        return newStr.toString();
    }

    public static boolean lineIsEmpty(String str) {
//        if (str.isEmpty()){
//            System.out.println("Line is EMPTY!");
//        } else {
//            System.out.println("Line is not empty.");
//        }
        return str.isEmpty();
    }

    public static String lineWithoutFirstAndLastWords(String str) {
        str = str.trim();
        if (amountWordsInLine(str) < 2) {
            return null;
        }
        String[] ar = str.split(" ");
        String newStr = "";
        for (int i = 1; i < ar.length - 1; i++) {
            newStr += ar[i];
            if (i != ar.length - 2){
                newStr += " ";
            }
        }
        return newStr;
    }
}
