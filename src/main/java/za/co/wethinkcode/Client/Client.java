package za.co.wethinkcode.Client;


import com.sun.source.doctree.EscapeTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
//        System.out.println("Name:");
//        String name =scanner.nextLine();
        try(Socket clientSocket=new Socket("localhost",5000);
            BufferedReader in=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintStream out=new PrintStream(clientSocket.getOutputStream()))
        {
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