package src.lesson22.task2;

public class Letters {
    private StringBuilder stringBuilder;

    public Letters() {
    }
    public Letters(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }
}
