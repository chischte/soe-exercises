package ch.juventus.socketproject.client;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Answer;

public class MainClient {


    public static void main(String[] args) {

        // CREATE AN INSTANCE OF THE SOCKET MANAGER:
        SocketManagerClient clientSocket = new SocketManagerClient();

        // GET SOCKET SERVER
        clientSocket.getSocketConnection();

        // RECEIVE QUESTION FROM CLIENT SOCKET:
        Question question = clientSocket.receiveQuestion();

        Answer answer = new Answer();
        answer.setName("Hans Schaudi");
        answer.setAnswer("243248");

        clientSocket.sendAnswer(answer);


    }

}
