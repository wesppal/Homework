package by.overone.homeworks;

public class HenRunnable implements Runnable{
    static int countHen = 0;
    int id = 0;

    public HenRunnable() {
        this.countHen++;
        id = countHen;
    }

    @Override
    public void run() {
        System.out.println("Parent Hen" + id + "- co co co");
    }
}
