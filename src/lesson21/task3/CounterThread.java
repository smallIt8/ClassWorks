package src.lesson21.task3;

public class CounterThread extends Thread{

    private Counter counter;

    @Override
    public void run() {
        for (int i =0; i < 50000; i++) {
            counter.increment();
        }
    }

    public CounterThread(Counter counter) {
        this.counter = counter;
    }
}
