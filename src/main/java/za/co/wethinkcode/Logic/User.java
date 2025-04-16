package za.co.wethinkcode.Logic;

import java.util.HashMap;
import java.util.Map;

public class User {
    private static Map<String,String> users=new HashMap<>();
    public static void addUser(String localPort,String name){
        users.put(localPort,name);
    }
    public static String getUser(String localPort){
        try{
            return users.get(localPort);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
