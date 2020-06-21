package ch.juventus.socketproject.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

    public static void main(String[] args){
        try {
            ServerSocket server = new ServerSocket(8888);
            Socket client=server.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
