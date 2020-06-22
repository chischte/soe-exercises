package ch.juventus.socketproject.client;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Answer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SocketManagerClient {

    Answer answer = new Answer();
    public Socket client = null;


    public void getSocketConnection() {
        try {
            client = new Socket("machinelogger.synology.me", 8888);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Question receiveQuestion() {
        Question question = null;
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(client.getInputStream());
            try {
                question = (Question) in.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(question.getQuestion());
        return question;
    }

    public void sendAnswer(Answer answer) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.writeObject(answer);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
