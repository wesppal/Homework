package by.overone.homeworks;

public class Main {
    public static void main(String[] args) {
        System.out.println(StrClass.amountWordsInLine("Hello my dear fried."));
        System.out.println(StrClass.amountWordsInLine("Hello my dear fried. My name is Pavel."));

        System.out.println(StrClass.editLine(" Hello my dear fried. My name is Pavel. "));
        System.out.println(StrClass.lineIsEmpty(""));
        System.out.println(StrClass.lineWithoutFirstAndLastWords(" Hello my dear fried. My name is Pavel. "));
    }
}

