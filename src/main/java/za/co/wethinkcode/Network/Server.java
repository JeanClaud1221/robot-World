package za.co.wethinkcode.Network;

import za.co.wethinkcode.Logic.User;
import za.co.wethinkcode.Logic.UserList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class Server implements Runnable{
    public static int PORT=5000;
    private final PrintStream out;
    private final BufferedReader in;
    private final String clientMachine;

    private UserList listOfUser=new UserList();
    public Server(Socket socket) throws IOException{

        clientMachine=socket.getLocalAddress().getHostName();
        in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out=new PrintStream(socket.getOutputStream());

    }
    @Override
    public void run() {
        
        try{
            String clientMessage;
            while((clientMessage=in.readLine())!=null){
                if (clientMessage.contains("Name")){
                    createNewUser(clientMessage,listOfUser);
                }
                if (clientMessage.equals("List")){
                    listOfUser.displayUsers();
                }
                System.out.println(clientMachine+" : "+clientMessage);
                out.println("Message received");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void createNewUser(String input, UserList ls){
            String[] args=input.split(":");
            User user=new User(args[1]);
            ls.addUser(user);
    }
}
