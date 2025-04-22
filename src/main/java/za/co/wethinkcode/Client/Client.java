package za.co.wethinkcode.Client;



import com.google.gson.Gson;
import za.co.wethinkcode.Logic.User;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        String name=scanner.nextLine();
        try(Socket clientSocket=new Socket("localhost",5000);
            BufferedReader in=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintStream out=new PrintStream(clientSocket.getOutputStream()))
        {
            out.println("Name:"+name);
            Gson test=new Gson();
            String JSON=test.toJson(new User("hello"));
            System.out.println(JSON);
            while(true){
                String input=scanner.nextLine();
                out.println(input);
                out.flush();
                System.out.println(in.readLine());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}