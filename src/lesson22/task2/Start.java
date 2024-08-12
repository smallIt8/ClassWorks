package src.lesson22.task2;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        Letters letters = new Letters(new StringBuilder("a"));

        LettersThread lettersThread1 = new LettersThread(letters);
        LettersThread lettersThread2 = new LettersThread(letters);
        LettersThread lettersThread3 = new LettersThread(letters);

        lettersThread1.start();
        lettersThread2.start();
        lettersThread3.start();

        lettersThread1.join();
        lettersThread2.join();
        lettersThread2.join();
    }
}
