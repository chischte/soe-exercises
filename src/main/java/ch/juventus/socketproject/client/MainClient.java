package ch.juventus.socketproject.client;

import ch.juventus.socketproject.SolutionObject;

public class MainClient {


    public static void main(String[] args) {

        SolutionObject solution = new SolutionObject();
        solution.setName("Hans Schaudi");
        solution.setSolution("243248");

        SocketManagerClient sender = new SocketManagerClient();
        sender.sendToServer(solution);


    }

}
