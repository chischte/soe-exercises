package ch.juventus.socketproject.client;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Solution;
import ch.juventus.socketproject.server.SocketManagerServer;

import java.net.ServerSocket;
import java.net.Socket;

public class MainClient {


    public static void main(String[] args) {



        // CREATE AN INSTANCE OF THE SOCKET MANAGER:
        SocketManagerClient clientSocket = new SocketManagerClient();

        // GET SOCKET SERVER
        Socket client = clientSocket.getSocketConnection();

        // RECEIVE QUESTION FROM CLIENT SOCKET:
        //clientSocket.receiveQuestion(client);
        Question question = clientSocket.receiveQuestion(client);

        Solution solution = new Solution();
        solution.setName("Hans Schaudi");
        solution.setSolution("243248");

        clientSocket.sendAnswer(solution);


    }

}
