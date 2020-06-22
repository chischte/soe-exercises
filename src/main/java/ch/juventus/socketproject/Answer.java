package ch.juventus.socketproject;

import java.io.Serializable;

public class Answer implements Serializable {
    private String answer;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public String getName() {
        return name;
    }
}
