package by.overone.homeworks;

public class Egg extends Thread {
    static int countEgg = 0;
    int id = 0;

    public Egg() {
        this.countEgg++;
        id = countEgg;
    }

    @Override
    public void run() {
        System.out.println("child egg"  + id + "- co co co");
    }
}
