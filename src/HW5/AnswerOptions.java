package HW5;

public class AnswerOptions {
    String[] textAnswer;
    private int result;

    public AnswerOptions(String[] textAnswer, int result) {
        this.textAnswer = textAnswer;
        this.result = result;
    }

    public int getResult() {
        return result;
    }
}
