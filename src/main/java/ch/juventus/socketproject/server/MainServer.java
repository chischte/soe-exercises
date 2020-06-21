package ch.juventus.socketproject.server;

import ch.juventus.socketproject.SolutionObject;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

    public static void main(String[] args) {
        SocketManagerServer serversocket = new SocketManagerServer();
        serversocket.createSocket();



    }
}
