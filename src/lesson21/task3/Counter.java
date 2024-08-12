package src.lesson21.task3;

public class Counter {
    private int count;

    public int getCount() {
        return count;
    }

    public void increment() {
        synchronized(this) {
            count++;
        }
    }

    public void decrement() {
        count++;
    }
}
