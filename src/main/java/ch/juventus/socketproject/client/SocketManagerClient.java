package ch.juventus.socketproject.client;

import ch.juventus.socketproject.SolutionObject;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SocketManagerClient {

    OutputStreamWriter streamWriter;
   SolutionObject solutionObject = new SolutionObject();


    public void sendToServer(){
        try (
                Socket client = new Socket("machinelogger.synology.me", 8888);
                ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
        ) {
            out.writeObject(solutionObject);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
