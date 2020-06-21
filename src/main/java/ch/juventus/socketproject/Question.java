package ch.juventus.socketproject;

import java.io.Serializable;

public class Question implements Serializable {
    private String question="WTF?";

        public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
