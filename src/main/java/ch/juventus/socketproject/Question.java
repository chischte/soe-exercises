package ch.juventus.socketproject;

import java.io.Serializable;

public class Question implements Serializable {
    private String question="12x12 = ?";

        public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
