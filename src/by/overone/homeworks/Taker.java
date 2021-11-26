package by.overone.homeworks;

public class Taker implements Runnable{
    private Buffer buffer;

    public Taker(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 4; i++) {
            try {
                buffer.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
