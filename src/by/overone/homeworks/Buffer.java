package by.overone.homeworks;

public class Buffer {
    private int size = 0;

    public synchronized void get() throws InterruptedException{
        while (size < 1) {
            wait();
        }
        size--;
        System.out.println("Taken from the buffer");
        System.out.println("Data in the buffer:" + size);
        notify();
    }

    public synchronized void set() throws InterruptedException{
        while (size >3){
            wait();
        }
        size++;
        System.out.println("Added in the buffer");
        System.out.println("Data in the buffer:" + size);
        notify();
    }
}
