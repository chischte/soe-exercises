package ch.juventus.socketproject.server;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Answer;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketManagerServer {
    public Socket client = new Socket();
    public ServerSocket server = null;
    public ObjectInputStream in = null;

    public void createSocket() {
        try {
            server = new ServerSocket(8888);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getClientConnection() {
        try {
            client = server.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendQuestion(Question question) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
            out.writeObject(question);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createInputStream(){
        try {
            in = new ObjectInputStream(client.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Answer receiveAnswer() {
        Answer answer = new Answer();
        try {
            answer = (Answer) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return answer;
    }
}
