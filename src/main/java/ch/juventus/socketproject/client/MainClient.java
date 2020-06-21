package ch.juventus.socketproject.client;

import ch.juventus.socketproject.Solution;

public class MainClient {


    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.setName("Hans Schaudi");
        solution.setSolution("243248");

        SocketManagerClient sender = new SocketManagerClient();
        sender.sendAnswer(solution);


    }

}
