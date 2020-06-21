package ch.juventus.socketproject.server;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Solution;

public class MainServer {

    public static void main(String[] args) {

        // CREATE AN INSTANCE OF THE SOCKET MANAGER:
        SocketManagerServer serverSocket = new SocketManagerServer();

        // SEND QUESTION
        Question question = new Question();
        serverSocket.sendQuestion(question);



        // RECEIVE SOLUTION

        Solution solution= serverSocket.receiveAnswer();
        System.out.println(solution.getName());
        System.out.println(solution.getSolution());
    }
}
