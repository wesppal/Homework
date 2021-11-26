package by.overone.homeworks;

public class EggRunnable implements Runnable{
    static int countEgg = 0;
    int id = 0;

    public EggRunnable() {
        this.countEgg++;
        id = countEgg;
    }

    @Override
    public void run() {
        System.out.println("child egg"  + id + "- co co co");
    }
}
