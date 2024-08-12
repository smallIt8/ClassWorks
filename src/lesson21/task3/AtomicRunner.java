package src.lesson21.task3;

public class AtomicRunner {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        CounterThread counterThread3 = new CounterThread(counter);
        CounterThread counterThread4 = new CounterThread(counter);

        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
        counterThread4.start();

        counterThread1.join();
        counterThread2.join();
        counterThread3.join();
        counterThread4.join();

        System.out.println(counter.getCount());
    }
}
