package ch.juventus.socketproject.client;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Answer;

public class MainClient {


    public static void main(String[] args) {

        // CREATE AN INSTANCE OF THE SOCKET MANAGER:
        SocketManagerClient socketManager = new SocketManagerClient();

        // GET SOCKET SERVER:
        socketManager.getSocketConnection();

        // RECEIVE QUESTION:
        Question question = socketManager.receiveQuestion();

        // SEND ANSWER:
        Answer answer = new Answer();
        answer.setName("Hans Schaudi");
        answer.setAnswer("243248");

        socketManager.sendAnswer(answer);


    }

}
