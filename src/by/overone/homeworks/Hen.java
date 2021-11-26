package by.overone.homeworks;

public class Hen extends Thread {
    static int countHen = 0;
    int id = 0;

    public Hen() {
        this.countHen++;
        id = countHen;
    }

    @Override
    public void run() {
        System.out.println("Parent Hen" + id + "- co co co");
    }
}
