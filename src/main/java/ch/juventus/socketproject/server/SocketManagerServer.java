package ch.juventus.socketproject.server;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Solution;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketManagerServer {
    public Socket client = new Socket();

    public ServerSocket getSocketConnection() {
        ServerSocket server = null;
        try {
            server = new ServerSocket(8888);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return server;

    }


    public void sendQuestionToServer(Question question, ServerSocket server) {
        try {
            //ServerSocket server = new ServerSocket(8888);
            client = server.accept();
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
            out.writeObject(question);
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public Solution receiveAnswerFromServer(ServerSocket server) {
        Solution solution = new Solution();
        ObjectInputStream in = null;
        //client = server.accept();
        try {
            in = new ObjectInputStream(client.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            solution = (Solution) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return solution;

    }

}
