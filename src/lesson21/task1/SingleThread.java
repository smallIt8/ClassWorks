package src.lesson21.task1;

public class SingleThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello" + getName());
    }
}
