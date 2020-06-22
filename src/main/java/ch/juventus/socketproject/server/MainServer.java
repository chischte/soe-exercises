package ch.juventus.socketproject.server;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Solution;

import java.net.ServerSocket;

public class MainServer {

    public static void main(String[] args) {

        // CREATE AN INSTANCE OF THE SOCKET MANAGER:
        SocketManagerServer serverSocket = new SocketManagerServer();
        // GET SOCKET SERVER
        ServerSocket server = serverSocket.getSocketConnection();

        // SEND QUESTION
        Question question = new Question();
        serverSocket.sendQuestionToServer(question,server);



        // RECEIVE SOLUTION

        Solution solution= serverSocket.receiveAnswerFromServer(server);
        System.out.println(solution.getName());
        System.out.println(solution.getSolution());
    }
}
