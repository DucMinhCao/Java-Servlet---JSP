package Bean;

public class AnswerUser {
    private int number;
    private String answer;

    public AnswerUser() {}

    public AnswerUser(int number, String answer) {
        this.number = number;
        this.answer = answer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "AnswerUser{" +
                "number=" + number +
                ", answer='" + answer + '\'' +
                '}';
    }
}
