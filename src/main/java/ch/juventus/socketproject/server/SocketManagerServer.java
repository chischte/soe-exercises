package ch.juventus.socketproject.server;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Solution;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketManagerServer {

    public void sendQuestion(Question question){
        try {
            ServerSocket server = new ServerSocket(8888);
            Socket client = server.accept();
            ObjectOutputStream out= new ObjectOutputStream(client.getOutputStream());
            out.writeObject(question);
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public Solution receiveAnswer() {
        Solution solution = new Solution();
        try (ServerSocket server = new ServerSocket(8888);
             Socket client = server.accept();
             ObjectInputStream in = new ObjectInputStream(client.getInputStream());) {
            try {
                solution = (Solution) in.readObject();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return solution;

    }

}
