package ch.juventus.socketproject.server;

import ch.juventus.socketproject.QuestionObject;
import ch.juventus.socketproject.SolutionObject;

public class MainServer {

    public static void main(String[] args) {

        // CREATE AN INSTANCE OF THE SOCKET MANAGER:
        SocketManagerServer serverSocket = new SocketManagerServer();

        // SEND QUESTION
//        QuestionObject question = new QuestionObject();
//        serverSocket.sendQuestion(question);



        // RECEIVE SOLUTION

        SolutionObject solution= serverSocket.receiveAnswer();
        System.out.println(solution.getName());
        System.out.println(solution.getSolution());
    }
}
