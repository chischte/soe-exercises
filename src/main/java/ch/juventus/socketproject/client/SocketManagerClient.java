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
        client = new Socket("machinelogger.synology.me", 8888);
        return client;
    }


    public Question receiveQuestion(Socket client) {
        Question question = null;
        ObjectInputStream in = new ObjectInputStream(client.getInputStream());
        question = (Question) in.readObject();
        System.out.println(question.getQuestion());
        return question;
    }

    public void sendAnswer(Solution solution) {
        try (
                Socket client = new Socket("machinelogger.synology.me", 8888);
                ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
        ) {
            out.writeObject(solution);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
