package by.overone.homeworks;

public class Adder implements Runnable {
    private Buffer buffer;

    public Adder(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 3; i++) {
            try {
                buffer.set();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
