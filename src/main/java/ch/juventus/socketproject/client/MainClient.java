package ch.juventus.socketproject.client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClient {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("machinelogger.synology.me", 8888);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
