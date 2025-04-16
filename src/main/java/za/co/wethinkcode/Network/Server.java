package za.co.wethinkcode.Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Server implements Runnable{
    public static int PORT=5000;
    private final PrintStream out;
    private final BufferedReader in;
    private final String clientMachine;
    public Server(Socket socket) throws IOException{

        clientMachine=socket.getInetAddress().getHostName();
        in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out=new PrintStream(socket.getOutputStream());

    }
    @Override
    public void run() {
        try{
            String clientMessage;
            while((clientMessage=in.readLine())!=null){
                System.out.println(clientMachine+" : "+clientMessage);
                out.println("Message received");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
