package ch.juventus.socketproject.server;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Answer;

public class MainServer {

    public static void main(String[] args) {

        // CREATE AN INSTANCE OF THE SOCKET MANAGER:
        SocketManagerServer serverSocket = new SocketManagerServer();

        // CREATE SOCKET
        serverSocket.createSocket();

        // GET CLIENT CONNECTION
        serverSocket.getClientConnection();

        // SEND QUESTION
        Question question = new Question();
        serverSocket.sendQuestion(question);


        serverSocket.createInputStream();

        // RECEIVE ANSWER
        Answer answer = serverSocket.receiveAnswer();
        System.out.println(answer.getName());
        System.out.println(answer.getAnswer());
    }
}
