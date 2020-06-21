package ch.juventus.socketproject.client;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Solution;

public class MainClient {


    public static void main(String[] args) {

        SocketManagerClient clientSocket = new SocketManagerClient();
        clientSocket.receiveQuestion();
        //Question question = clientSocket.receiveQuestion();

        Solution solution = new Solution();
        solution.setName("Hans Schaudi");
        solution.setSolution("243248");

        clientSocket.sendAnswer(solution);


    }

}
