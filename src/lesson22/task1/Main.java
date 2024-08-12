package src.lesson22.task1;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Thread thread1 = new Thread(new RunnableThread());
        Thread thread2 = new Thread(new RunnableThread());
        Thread thread3 = new Thread(new RunnableThread());

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

    }
}
