package ch.juventus.socketproject.client;

import ch.juventus.socketproject.Question;
import ch.juventus.socketproject.Solution;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SocketManagerClient {

    OutputStreamWriter streamWriter;
   Solution solution = new Solution();


    public void receiveQuestion(){
        try (
                Socket client = new Socket("machinelogger.synology.me", 8888);
                ObjectInputStream in = new ObjectInputStream(client.getInputStream());
        ) {
            Question question = null;
            try {
                question = (Question) in.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(question.getQuestion());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendAnswer(Solution solution){
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
