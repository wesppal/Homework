package by.overone.game;

public class Cell {
    int index;
    char figure;
    static int counter = 0;

    public Cell() {
        this.index = counter;
        this.figure = ' ';
        counter++;
        if (counter == GameField.lengthField) {
            counter = 0;
        }
    }

    @Override
    public String toString() {
        return "Cell{" +
                "index=" + index +
                ", figure=" + figure +
                '}';
    }
}
