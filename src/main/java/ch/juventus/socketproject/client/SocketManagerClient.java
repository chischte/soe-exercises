package ch.juventus.socketproject.client;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Solution;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketManagerClient {

    OutputStreamWriter streamWriter;
    Solution solution = new Solution();


    public Socket getSocketConnection() {
        Socket client = null;
        try {
            client = new Socket("machinelogger.synology.me", 8888);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return client;
    }

    public Question receiveQuestion(Socket client) {
        Question question = null;
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(client.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            question = (Question) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(question.getQuestion());
        return question;
    }

    public void sendAnswerToServer(Solution solution, Socket server) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(server.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.writeObject(solution);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
