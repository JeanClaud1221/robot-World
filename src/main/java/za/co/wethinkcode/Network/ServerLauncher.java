package za.co.wethinkcode.Network;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerLauncher {
    public static void main(String[] args){
        try(ServerSocket serverSocket=new ServerSocket(Server.PORT)){
            while(true){
                Socket clientSocket=serverSocket.accept();
                new Thread(new Server(clientSocket)).start();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
