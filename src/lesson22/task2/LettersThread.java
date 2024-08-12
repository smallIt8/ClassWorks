package src.lesson22.task2;

public class LettersThread extends Thread {

    private Letters letters;

    @Override
    public void run() {
        synchronized (letters) {
            for (int i = 0; i < 100; i++) {
                System.out.println(letters.getStringBuilder());
            }
            letters.setStringBuilder(letters.getStringBuilder().append("b"));
            System.out.println(letters.getStringBuilder());
        }
    }

    public LettersThread() {
    }

    public LettersThread(Letters letters) {
        this.letters = letters;
    }
}
