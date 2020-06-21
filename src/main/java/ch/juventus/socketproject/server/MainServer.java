package ch.juventus.socketproject.server;

import ch.juventus.socketproject.SolutionObject;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

    public static void main(String[] args) {

        try (ServerSocket server = new ServerSocket(8888);
             Socket client = server.accept();
             ObjectInputStream inputObject = new ObjectInputStream(client.getInputStream());) {
            SolutionObject solutionObject= null;
            try {
                solutionObject = (SolutionObject) inputObject.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


            System.out.println(solutionObject.getSolution());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
