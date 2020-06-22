package ch.juventus.socketproject.server;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Answer;

public class MainServer {

    public static void main(String[] args) {

        // CREATE AN INSTANCE OF THE SOCKET MANAGER:
        SocketManagerServer socketManager = new SocketManagerServer();

        // CREATE SOCKET
        socketManager.createSocket();

        // GET CLIENT CONNECTION
        socketManager.getClientConnection();

        // SEND QUESTION
        Question question = new Question();
        socketManager.sendQuestion(question);

        // RECEIVE ANSWER
        Answer answer = socketManager.receiveAnswer();
        System.out.println(answer.getName());
        System.out.println(answer.getAnswer());
    }
}
