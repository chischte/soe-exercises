package ch.juventus.socketproject.client;

public class MainClient {


    public static void main(String[] args) {
        SocketManagerClient sender = new SocketManagerClient();
        sender.sendToServer();


    }

}
